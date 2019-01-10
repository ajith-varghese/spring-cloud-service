package com.dfm.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dfm.springcloudservice.config.UserConfig;
import com.dfm.springcloudservice.model.User;

@RestController
public class UserDetails {
	@Autowired
	UserConfig userConfig;
	
	@GetMapping("/user/{id}")
	User getUserDetails(@PathVariable String id) {
		return(userConfig.getUser(id));
	}
}
