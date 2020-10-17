package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/worker/*")
public class WorkerController {
	@RequestMapping
	public String home() {
		return "worker/worker";
	}
	
	@RequestMapping(value ="JoinForm")
	public String JoinForm() {
		//기존에 입력하였던 이력서가 있을시에 가져오기
		//이력서에 현재까지 참여했던 프로젝트를 이력서에 자동적으로 추가할지 여부 선택
		return "worker/JoinForm.jsp"
	}
	
	@RequestMapping(value ="MyPage")
	public String MyPage() {
		//참여했던 프로젝트 내역
		//프로젝트에 대한 결과물 내역
		//진행 중인 프로젝트의 기간
		//평가 내역
		//프로젝트 선정 결과 확인
		return "worker/MyPage.jsp"
	}
	
	@RequestMapping(value ="Person_Info")
	public String Person_Info() {
		//가입 당시에 입력하였던 정보 가져오기
		return "worker/Person_Info.jsp"
	}
	
	@RequestMapping(value ="Point_")
	public String Point_() {
		//완료된 프로젝트의 포인트 내역
		//완료된 프로젝트의 포인트 지급 여부
		return "worker/Point_.jsp"
	}
	
	@RequestMapping(value ="Project_Result")
	public String Project_Result() {
		//해당 프로젝트의 결과물 제출
		return "worker/Project_Result.jsp"
	}
	
}