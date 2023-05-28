package com.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ecom_users")
public class User {
	
	@Id
	private Long user_mobile;
	
	private String user_name;
	
	private int  user_age;
	
	private String Address;
	
	
	private String user_email;
	
	private String user_password;
	
	

	public User(Long user_mobile, String user_name, int user_age, String address, String user_email,
			String user_password) {
		super();
		this.user_mobile = user_mobile;
		this.user_name = user_name;
		this.user_age = user_age;
		Address = address;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public Long getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(Long user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [user_mobile=" + user_mobile + ", user_name=" + user_name + ", user_age=" + user_age + ", Address="
				+ Address + ", user_email=" + user_email + "]";
	}
	
	
	
	

}
