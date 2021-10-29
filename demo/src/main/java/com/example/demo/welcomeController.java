package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.Location;
import com.user.User;

@RestController
public class welcomeController {
	
	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "Welcome to Anik Boot";
	}
	@RequestMapping(value="/users")
	public List<User> getAllUsers() {
		User user1 = new User("u1", "Jany", "Lawrence",new Location("l1", "Lagos"),"Jany@gmail.com");
			
		   User user2 = new User("u2", "Jadon", "Mills",new Location("l2", "Asaba"),"Jadon@gmail.com");
			
		return Arrays.asList(user1, user2);	
		
	   }
	
}