package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/main")
	public String mainPage() {
		return "public";
	}
}