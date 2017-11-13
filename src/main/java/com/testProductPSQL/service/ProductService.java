package com.testProductPSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProductPSQL.model.Product;
import com.testProductPSQL.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProduct() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll()
		.forEach(products::add);
		return products;
	}
	
	public Product getOneProduct(long id) {
		return productRepository.findOne(id);
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void editProduct(Product product, long id) {
		productRepository.save(product);
	}
	
	public void deleteProduct(long id) {
		productRepository.delete(id);
	}
}
