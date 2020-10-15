package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager/*")
public class ManagerController {
	@RequestMapping
	public String home() {
		return "manager/manager";
	}

}