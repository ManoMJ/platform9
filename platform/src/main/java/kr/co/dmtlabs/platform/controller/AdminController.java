package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	@RequestMapping
	public String home() {
		return "admin/admin";
	}

}