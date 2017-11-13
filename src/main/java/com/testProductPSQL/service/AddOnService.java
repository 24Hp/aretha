package com.testProductPSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProductPSQL.repository.AddOnRepository;
import com.testProductPSQL.model.AddOn;

@Service
public class AddOnService {
	@Autowired
	private AddOnRepository addRepo;
	
	public List<AddOn> getAdds(long id) {
		List<AddOn> adds = new ArrayList<>();
		addRepo.findByProductId(id)
		.forEach(adds::add);
		return adds;
	}
	
	public AddOn getOneAdd(long id) {
		return addRepo.findOne(id);
	}
	
	public void addsPlus(AddOn adds) {
		addRepo.save(adds);
	}
	
	public void addsEdit(AddOn adds) {
		addRepo.save(adds);
	}
	
	public void addsDelete(long id) {
		addRepo.delete(id);
	}
}
