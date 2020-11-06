package kr.co.dmtlabs.platform;

import kr.co.dmtlabs.platform.domain.Project;
import kr.co.dmtlabs.platform.repository.ProjectRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DataJpaTest
class PlatformApplicationTests {

	private final String title="테스트";
	private final String content="설명";
	private final String creator="사람1";
	private final String owner = "사람2";
	private final String deadline="2020-11-07";

	@Autowired
	private ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

}
