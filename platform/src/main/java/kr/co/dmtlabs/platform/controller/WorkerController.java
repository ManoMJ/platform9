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
	
	@RequestMapping
	public String selectMyInfo() {
		
		return "worker/selectWorkerInfo";
	}

}