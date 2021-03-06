package com.dfm.springcloudservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dfm.springcloudservice.config.PropertyConfig;
import com.dfm.springcloudservice.model.User;
import com.dfm.springcloudservice.service.UserService;



@RestController
public class UserDetails {
	@Autowired
	UserService userService;
	
	@Autowired
	PropertyConfig config;
	
	
	@GetMapping("/user/{id}")
	User getUserDetails(@PathVariable String id) {
		return(userService.getUserDetails(id));
	}
	
	@GetMapping("/users")
	List<User> getUsers() {
		return(userService.getAllUsers());
	}
	
	@GetMapping("/getmessage")
	String getMessage() {
		return(config.getMsg());
	}
	
	@GetMapping("/getname")
	String getInstancename() {
		return(config.getInstanceName());
	}
	
	@PostMapping("/adduser")
	List<User> addUser(@RequestBody User user) {
		return(userService.addUser(user));
	}
}
