package com.testProductPSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testProductPSQL.service.AddOnService;
import com.testProductPSQL.service.ProductService;
import com.testProductPSQL.model.AddOn;
import com.testProductPSQL.model.Product;

@RestController
public class AddOnController {
	@Autowired
	private AddOnService service;
	private ProductService productService;
	
	@RequestMapping("/products/{id}/adds")
	public List<AddOn> getAllAdds(@PathVariable long id) {
		return service.getAdds(id);
	}
	
	@RequestMapping("/products/{productId}/adds/{id}")
	public AddOn getOneAdd(@PathVariable long id) {
		return service.getOneAdd(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products/{id}/adds")
	public void addPlus(@RequestBody AddOn adds ,@PathVariable long id) {
		adds.setProduct(new Product(id));
		service.addsPlus(adds);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{productId}/adds/{id}")
	public void addEdit(@RequestBody AddOn adds,@PathVariable long productId ,@PathVariable long id) {
		adds.setProduct(new Product(productId));
		service.addsEdit(adds);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}/adds/{id}")
	public void addDelete(@PathVariable long id) {
		service.addsDelete(id);
	}
}
