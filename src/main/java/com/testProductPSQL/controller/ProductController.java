package com.testProductPSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testProductPSQL.model.Product;
import com.testProductPSQL.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		return productService.getAllProduct();
	}
	
	@RequestMapping("/products/{id}")
	public Product getOneProduct(@PathVariable long id) {
		return productService.getOneProduct(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void editProduct(@RequestBody Product product,@PathVariable long id) {
		productService.editProduct(product, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void deleteProduct(@PathVariable long id) {
		productService.deleteProduct(id);
	}
}
