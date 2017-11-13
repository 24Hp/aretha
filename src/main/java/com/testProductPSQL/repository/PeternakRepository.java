package com.testProductPSQL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.Peternak;

public interface PeternakRepository extends CrudRepository<Peternak, Long> {
	public List<Peternak> findByPosition(String position);
	public List<Peternak> findById(long id);
}
