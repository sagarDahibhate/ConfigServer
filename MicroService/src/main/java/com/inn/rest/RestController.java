package com.inn.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@Value("${my.app.name}")
	private String title;
	
	
	@GetMapping("/msg")
	public String showMsg() {
		return "welcome to config client "+title;
	}
}
