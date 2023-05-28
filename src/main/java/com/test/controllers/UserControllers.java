package com.test.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.User;
import com.test.services.userService;

@Controller
@RequestMapping("/user")
public class UserControllers {
	
	@Autowired
	private userService uService;
	
	@PostMapping("/create")
	@ResponseBody
	public User createUser(@RequestBody User u) {
		
		User uCreated = uService.createUser(u);
		return uCreated;
	}
	
	@PatchMapping("/update")
	@ResponseBody
	public User updateUser(@RequestBody User u) {
		
		User updated =  uService.updateUser(u);
		return updated;
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Optional<User> getUser(@PathVariable long id ) {
		return uService.findUser(id);
	}
	

}
