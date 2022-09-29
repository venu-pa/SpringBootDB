package com.example.DBOperations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DBOperations.entiry.User;
import com.example.DBOperations.service.UserService;

@RestController
@RequestMapping("/v1")
public class DBController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/look")
	public String visible() {
		System.out.println("program start");
		return "This is look service";
		
	}
	
	@PostMapping("/saveUser")
	public User saveuser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
	

}
