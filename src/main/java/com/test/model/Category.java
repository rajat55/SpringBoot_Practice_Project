package com.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ecom_category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_Id;
	
	private String category_Name;
	private String category_Description;
	
	
	
	public int getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}
	public String getCategory_Name() {
		return category_Name;
	}
	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}
	public String getCategory_Description() {
		return category_Description;
	}
	public void setCategory_Description(String category_Description) {
		this.category_Description = category_Description;
	}
	
	
	public Category(int category_Id, String category_Name, String category_Description) {
		super();
		this.category_Id = category_Id;
		this.category_Name = category_Name;
		this.category_Description = category_Description;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
