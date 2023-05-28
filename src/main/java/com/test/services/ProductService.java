package com.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Product;
import com.test.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository Prepo;

	public Product createProduct(Product product) {

		Product p = Prepo.save(product);

		return p;
	}

	public Product updateProduct(Product product, int P_id) {

		Optional<Product> pFind = Prepo.findById(P_id);
		System.out.println(pFind);
		Product pUpdated = Prepo.save(product);

		return pUpdated;
	}

	public List<Product> getAllProducts() {

		List<Product> productList = Prepo.findAll();

		return productList;
	}

	public Optional<Product> getProductById(int id) {

		Optional<Product> pById = Prepo.findById(id);

		return pById;
	}

	public String deleteProductById(int id) {

		if (Prepo.existsById(id)) {

			try {
				Prepo.deleteById(id);
				return "Item Deleted Sucessfully";

			} catch (Exception e) {
				return e.getMessage();
			}

		} else {
			return "Item not found";
		}
	}

}
