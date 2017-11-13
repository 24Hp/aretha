package com.testProductPSQL.repository;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
