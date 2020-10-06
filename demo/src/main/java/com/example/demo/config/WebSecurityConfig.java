package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("manager").password("{noop}manager").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("worker").password("{noop}worker").roles("WORKER");
		auth.inMemoryAuthentication().withUser("reader").password("{noop}reader").roles("READER");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
        web.ignoring()
        // Spring Security should completely ignore URLs starting with /resources/
        .antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http // HttpSecurity 객체를 설정한다.
				.authorizeRequests() // 권한요청 처리 설정 메서드이다.
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/manager/**").hasAnyRole("ADMIN","MANAGER")
				.antMatchers("/reader/**").hasAnyRole("ADMIN","MANAGER","READER")
				.antMatchers("/worker/**").hasAnyRole("ADMIN","MANAGER","READER","WORKER")
				.antMatchers("/main").authenticated()
				.and().logout().permitAll().and()
				.formLogin().and().csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}
