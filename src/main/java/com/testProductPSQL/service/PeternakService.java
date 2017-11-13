package com.testProductPSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProductPSQL.model.PeternakA;
import com.testProductPSQL.model.PeternakB;
import com.testProductPSQL.repository.TestPeternakRepository;

@Service
public class PeternakService {
	@Autowired
	private TestPeternakRepository peternakRepo;
	//private PeternakRepository peternakRepo;
	
	public List<PeternakA> getAllPeternak() {
		List<PeternakA> peternak = new ArrayList<>();
		peternakRepo.findByPosition("Keluarga")
		.forEach(peternak::add);
		return peternak;
	}
}
