package com.test.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApp {
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to Test";
		
	}
	
	@GetMapping("/{x}")
	public ResponseEntity<String> pathEndPoint(@PathVariable int x){
		ResponseEntity<String> res = new ResponseEntity<String>("The Path is " + x, HttpStatus.OK);
		return res;
	}
	
}
