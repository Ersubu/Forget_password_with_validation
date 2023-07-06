package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.User;
import com.dakr.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	public UserServiceImpl ser;
	
//	@PostMapping("/save")
//	public User saveUser(@RequestBody User us) {
//	
//	return ser.saveUserDetails(us);
//	} 
	
	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestParam String email) {

		String response = ser.forgotPassword(email);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:9091/reset-password?token=" + response;
		}
		return response;
	}

	@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String token,@RequestParam String password,@RequestParam String confPassword) {

		return ser.resetPassword(token, password,confPassword);
	}

}
