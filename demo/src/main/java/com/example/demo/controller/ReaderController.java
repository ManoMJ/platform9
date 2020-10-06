package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reader/*")
public class ReaderController {
	@RequestMapping
	public String home() {
		return "reader/reader";
	}

}
