package kr.co.dmtlabs.platform.controller;

import kr.co.dmtlabs.platform.domain.Project;
import kr.co.dmtlabs.platform.repository.ProjectRepository;
import kr.co.dmtlabs.platform.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/manager/*")
public class ManagerController {
	@Autowired
	private ProjectService projectService;

	@Autowired
	private ProjectRepository projectRepository;

	@RequestMapping
	public String home() {
		return "manager/manager";
	}

	/* 프로젝트 목록 */
	@RequestMapping("/get/projectList")
	public String getProjectList(@PageableDefault Pageable pageable, Model model) {
		model.addAttribute("projectList", projectService.findProjectList(pageable));
		return "manager/selectMyProjectList";
	}

	/* 프로젝트 생성 */
	@RequestMapping("/create/project")
	public ResponseEntity<?> createProject(@RequestBody Project project) {
		project.setCreated_Time(LocalDateTime.now());
		projectRepository.save(project);
		return new ResponseEntity<>("{}", HttpStatus.CREATED);
	}

}