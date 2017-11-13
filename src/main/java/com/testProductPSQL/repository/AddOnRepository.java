package com.testProductPSQL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.AddOn;

public interface AddOnRepository extends CrudRepository<AddOn, Long> {
	public List<AddOn> findByProductId(long productId);
}
