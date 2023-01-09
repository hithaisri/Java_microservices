package com.cts.project6.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;



@RestController
public class ThymeLeafController {

	@RequestMapping("/start")
	public String getStartPage(HttpServletResponse response) {
		 response.setHeader("Content-Type","text/html");
		return "form";
				
	}
}
