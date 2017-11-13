package com.testProductPSQL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testProductPSQL.model.PeternakA;
import com.testProductPSQL.model.PeternakB;

public interface TestPeternakRepository extends CrudRepository<PeternakA, Long> {
	public List<PeternakA> findByPosition(String position);
}
