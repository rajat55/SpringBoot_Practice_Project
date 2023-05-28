package com.test;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class Student {

	@RequestMapping("/")
	@ResponseBody
	public String test() {
		
		System.out.println("Running");
		return "Hello from BOot";
	}
	
	@GetMapping("/json")
	@ResponseBody
	public HashMap<String,String> jsonFun(){
		
		HashMap<String,String> map = new HashMap();
		map.put("name","Rajat");
		map.put("City", "Noida");
		map.put("Age", "22");
		
		return map;
	}
}
