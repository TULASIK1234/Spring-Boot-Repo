package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorld {
	
	@GetMapping("/Hello")
	
	public String Hello()
	{
		return "Welcome to Hello World in Spring Boot";
	}
}
