package com.dfm.springcloudservice.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.dfm.springcloudservice.model.User;

@Configuration
public class UserConfig {

	public List<User> getUsersList(){
		List<User> l = new ArrayList<User>();
		l.add(createUser("1", "Ajith", "Varghese", 40, "Male"));
		l.add(createUser("2", "John", "Thomas", 34, "Male"));
		l.add(createUser("3", "Tom", "Nixon", 44, "Male"));
		l.add(createUser("4", "Linda", "Patterson", 50, "Female"));
		return(l);
	}
	
	public User createUser(String id, String firstName, String lastName, int age, String gender) {
		User u = new User();
		u.setAge(age);
		u.setEmployeeId(id);
		u.setFirstName(firstName);
		u.setGender(gender);
		u.setLastName(lastName);
		return(u);
	}
	
	public User getUser(String id) {
		User u = getUsersList().stream()
							.filter(user -> user.getEmployeeId().equals(id))
							.findAny()
			                .orElse(null);
		return(u);
	}
}
