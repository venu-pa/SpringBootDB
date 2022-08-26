package com.example.DBOperations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DBOperations.entiry.User;
import com.example.DBOperations.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public User saveUser(User u) {
		
		return userRepo.save(u);
	}

}
