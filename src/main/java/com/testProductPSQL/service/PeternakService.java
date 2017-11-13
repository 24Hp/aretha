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
		peternakRepo.findByPosition("Peternak")
		.forEach(peternak::add);
		return peternak;
	}
	
	public PeternakA getOnePeternak(long id) {
		return peternakRepo.findOne(id);
	}
	
	public void addPeternak(PeternakA peternak) {
		peternakRepo.save(peternak);
	}
	
	public void editPeternak(PeternakA peternak, long id) {
		peternakRepo.save(peternak);
	}
	
	public void deletePeternak(long id) {
		peternakRepo.delete(id);
	}
}
