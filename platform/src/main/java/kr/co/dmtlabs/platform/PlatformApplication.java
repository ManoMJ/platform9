package kr.co.dmtlabs.platform;

import kr.co.dmtlabs.platform.domain.Project;
import kr.co.dmtlabs.platform.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class PlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(ProjectRepository projectRepository) throws Exception {
		return (args) -> {
			IntStream.rangeClosed(1, 10).forEach(index ->
					projectRepository.save(Project.builder()
							.Project_Name("프로젝트" + index)
							.Project_Desc("내용" + index)
							.Deadline("2020-11-07")
							.build()));

		};
	}
}
