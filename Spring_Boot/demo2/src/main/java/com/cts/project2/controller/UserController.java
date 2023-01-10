package com.cts.project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project2.entity.User;
import com.cts.project2.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService iUserService;
	
	
	@PostMapping
	public Integer saveUser(@RequestBody User user) {
		return iUserService.saveUser(user);
	}

}
