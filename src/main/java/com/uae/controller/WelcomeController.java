package com.uae.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


	@RequestMapping("/test")
	public String welcome(@RequestParam String name) throws Exception {
		
		System.out.println("---->"+name);
		if(name==null || name.isEmpty()) {
			throw new EmployeeNotFoundException("Employee details either null / empty");
		}
		
		return "welcome"+name;
	}

}