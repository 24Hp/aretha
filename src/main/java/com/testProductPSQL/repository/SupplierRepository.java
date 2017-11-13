package com.testProductPSQL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
	public List<Supplier> findByPosition(String position);
}
