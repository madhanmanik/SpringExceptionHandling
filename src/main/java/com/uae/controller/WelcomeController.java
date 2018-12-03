package com.uae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WelcomeController {


	@GetMapping("/test")
	public String welcome(@RequestParam String name) throws Exception {
		
		System.out.println("---->"+name);
		if(name==null || name.isEmpty()) {
			throw new EmployeeNotFoundException("Employee details either null / empty");
		}
		
		return "welcome"+name;
	}

}