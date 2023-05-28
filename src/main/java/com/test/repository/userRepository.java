package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.test.model.User;

public interface userRepository  extends JpaRepository<User,Long>{
	

}