package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Category;
import com.test.repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository  Prepo;
	
	
	public Category createCategory(Category category) {
		
		Category cReceived = Prepo.save(category);
		
		return cReceived;
		
	}
	
	public Category updateCategory(Category c,int id) {
		
		Category cUpdated = Prepo.save(c);
		
		return cUpdated;
	}
	
	public String deleteCategory(int id) {
		
		Prepo.deleteById(id);
		
		return "Item deleted sucessfully";
	}
	

}
