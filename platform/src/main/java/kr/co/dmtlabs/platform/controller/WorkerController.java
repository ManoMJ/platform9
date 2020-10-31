package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/worker/*")
public class WorkerController {
	@RequestMapping("/main")
	public String home() {
		return "worker/worker";
	}
	
	@RequestMapping("/get/myInfo")
	public String selectMyInfo() {
		//select 워커의 개인정보
		//프로젝트 결과 리스트
		//작업 중인 프로젝트 리스트
		//나의 프로젝트 리스트
		return "worker/selectWorkerInfo";
	}
	
	public String selectResume() {
		//worker가 등록한 이력서 확인
		return "worker/selectResume";
	}
	
	public String insertJob_Result() {
		//worker의 작업에 대한 결과물 제출
		return "worker/insertJob_Result";
	}
	
	public String selectEvaluation() {
		//worker의 작업물에 대한 평가 확인 및 worker의 총 평점 확인
		return "worker/selectEvaluation";
	}

}