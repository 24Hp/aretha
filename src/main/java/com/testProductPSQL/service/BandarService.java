package com.testProductPSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProductPSQL.model.Bandar;
import com.testProductPSQL.repository.BandarRepository;

@Service
public class BandarService {
	@Autowired
	private BandarRepository bandarRepo;
	
	public List<Bandar> getAllBandar() {
		List<Bandar> bandars = new ArrayList<>();
		bandarRepo.findByPosition("Bandar")
		.forEach(bandars::add);
		return bandars;
	}
	
	public Bandar getOneBandar(long id) {
		return bandarRepo.findOne(id);
	}
	
	public void addBandar(Bandar bandar) {
		bandarRepo.save(bandar);
	}
	
	public void editBandar(Bandar bandar, long id) {
		bandarRepo.save(bandar);
	}
	
	public void deleteBandar(long id) {
		bandarRepo.delete(id);
	}
}
