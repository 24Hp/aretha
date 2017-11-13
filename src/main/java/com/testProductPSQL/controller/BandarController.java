package com.testProductPSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testProductPSQL.service.BandarService;
import com.testProductPSQL.model.Bandar;

@RestController
public class BandarController {
	@Autowired
	private BandarService bandarService;
	
	@RequestMapping("/bandar")
	public List<Bandar> getAllBandar() {
		return bandarService.getAllBandar();
	}
	
	@RequestMapping("/bandar/{id}")
	public Bandar getOneBandar(@PathVariable long id) {
		return bandarService.getOneBandar(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/bandar")
	public void bandarPlus(@RequestBody Bandar bandar) {
		bandarService.addBandar(bandar);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/bandar/{id}")
	public void bandarEdit(@RequestBody Bandar bandar,@PathVariable long id) {
		bandarService.editBandar(bandar, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/bandar/{id}")
	public void bandarDelete(@PathVariable long id) {
		bandarService.deleteBandar(id);
	}
}
