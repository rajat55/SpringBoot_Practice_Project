package com.test.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository uRepo;
	
	public User createUser(User user) {
		
		
		User uSaved = uRepo.save(user);
		
		return uSaved;
		
	}
	
	public User updateUser(User user) {
		
		User uUpdated = uRepo.save(user);
		
		return uUpdated;
	}
	public Optional<User> findUser(long id) {
		return uRepo.findById(id);
	}

}
