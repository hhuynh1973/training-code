package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("Hello World, this is my Spring Boot Application!");
	}
	
	
	
	
}
