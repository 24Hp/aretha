package com.testProductPSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testProductPSQL.model.PeternakA;
import com.testProductPSQL.model.PeternakB;
import com.testProductPSQL.service.PeternakService;

@RestController
public class PeternakController {
	@Autowired
	private PeternakService peternakService;
	
	@RequestMapping("/peternak")
	public List<PeternakA> getAllPeternak() {
		return peternakService.getAllPeternak();
	}
}
