package kr.co.dmtlabs.platform.config;

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
				.antMatchers("/resources/**").antMatchers("/h2-console/**");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http // HttpSecurity 媛앹껜瑜� �꽕�젙�븳�떎.
				.authorizeRequests() // 沅뚰븳�슂泥� 泥섎━ �꽕�젙 硫붿꽌�뱶�씠�떎.
				.antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/manager/**").hasAnyRole("ADMIN", "MANAGER")
				.antMatchers("/reader/**").hasAnyRole("ADMIN", "MANAGER", "READER").antMatchers("/worker/**")
				.hasAnyRole("ADMIN", "MANAGER", "READER", "WORKER").antMatchers("/main").authenticated().and().logout()
				.permitAll().and().formLogin().and().csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}
