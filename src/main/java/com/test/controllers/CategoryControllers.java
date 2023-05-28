package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Category;
import com.test.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryControllers {

	@Autowired
	private CategoryService cService;
	
	@PostMapping("/create")
	public Category createCategory(@RequestBody Category c) {
		
		return cService.createCategory(c);
	}
	
	
	
	
}
