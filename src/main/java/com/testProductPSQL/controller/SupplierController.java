package com.testProductPSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testProductPSQL.model.Supplier;
import com.testProductPSQL.service.SupplierService;

@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("/supplier")
	public List<Supplier> getAllBandar() {
		return supplierService.getAllSupplier();
	}
	
	@RequestMapping("/supplier/{id}")
	public Supplier getOneSupplier(@PathVariable long id) {
		return supplierService.getOneSupplier(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/supplier")
	public void supplierPlus(@RequestBody Supplier supplier) {
		supplierService.addSupplier(supplier);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/supplier/{id}")
	public void supplierEdit(@RequestBody Supplier supplier,@PathVariable long id) {
		supplierService.editSupplier(supplier, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/supplier/{id}")
	public void supplierDelete(@PathVariable long id) {
		supplierService.deleteSupplier(id);
	}
}
