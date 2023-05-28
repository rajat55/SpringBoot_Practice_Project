package com.test.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Product;
import com.test.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductControllers {

	@Autowired
	private ProductService Pservice;

	@PostMapping("/create")
	@ResponseBody
	public Product createProduct(@RequestBody Product product) {

		Product pReceived = Pservice.createProduct(product);
		System.out.println("Product Controller is Running");
		System.out.println(Pservice);

		return pReceived;

	}

	@PostMapping("/update")
	@ResponseBody
	public Product updateProduct(@RequestBody Product product) {

		System.out.println(product);
		Product Pfind = Pservice.updateProduct(product, product.getProduct_id());

		return Pfind;
	}

	@GetMapping("/getall")
	@ResponseBody
	public List<Product> getAllProducts() {

		return Pservice.getAllProducts();

	}

	@GetMapping("/getbyid/{id}")
	@ResponseBody
	public Optional<Product> getProductById(@PathVariable int id) {

		return Pservice.getProductById(id);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteProductById(@PathVariable int id) {

		return Pservice.deleteProductById(id);

	}

}
