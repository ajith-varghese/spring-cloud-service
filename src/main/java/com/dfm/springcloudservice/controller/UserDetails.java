package com.dfm.springcloudservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dfm.springcloudservice.model.User;

@RestController
public class UserDetails {

	@GetMapping("/user/{id}")
	User getUserDetails(@PathVariable String id) {
		User u = new User();
		u.setAge(40);
		u.setEmployeeId(id);
		u.setFirstName("Ajith");
		u.setGender("Male");
		u.setLastName("Varghese");
		return(u);
	}
}
