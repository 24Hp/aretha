package com.testProductPSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProductPSQL.model.Supplier;
import com.testProductPSQL.repository.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepo;
	
	public List<Supplier> getAllSupplier() {
		List<Supplier> supplier = new ArrayList<>();
		supplierRepo.findByPosition("Supplier")
		.forEach(supplier::add);
		return supplier;
	}
	
	public Supplier getOneSupplier(long id) {
		return supplierRepo.findOne(id);
	}
	
	public void addSupplier(Supplier supplier) {
		supplierRepo.save(supplier);
	}
	
	public void editSupplier(Supplier supplier, long id) {
		supplierRepo.save(supplier);
	}
	
	public void deleteSupplier(long id) {
		supplierRepo.delete(id);
	}
}
