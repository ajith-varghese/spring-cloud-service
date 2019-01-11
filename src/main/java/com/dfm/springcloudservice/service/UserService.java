package com.dfm.springcloudservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dfm.springcloudservice.config.UserConfig;
import com.dfm.springcloudservice.model.User;

@Service
public class UserService {
	@Autowired
	UserConfig userConfig;
	
	public User getUserDetails(String id) {
		return(userConfig.getUser(id));
	}
	
	public List<User> getAllUsers(){
		return(userConfig.getUsers());
	}
}
