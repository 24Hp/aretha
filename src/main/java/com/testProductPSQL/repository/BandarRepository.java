package com.testProductPSQL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.Bandar;

public interface BandarRepository extends CrudRepository<Bandar, Long> {
	public List<Bandar> findByPosition(String position);
}
