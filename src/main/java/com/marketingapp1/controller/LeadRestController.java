package com.marketingapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp1.entity.Lead;
import com.marketingapp1.repository.LeadRepository;

@RestController
@RequestMapping("/leads")
public class LeadRestController {
	
	
	
	@Autowired
	private LeadRepository repo;
	
	@GetMapping
	public List<Lead> list(){
		List<Lead> leads = repo.findAll();
		return leads;
	}
	
	@PostMapping
	public void save(@RequestBody Lead leads) {
		repo.save(leads);
	}
	
	@PutMapping
	public void update(@RequestParam("id") long id,@RequestBody Lead leads) {
		leads.setId(id);
		
		repo.save(leads);
		
		
	}
	@DeleteMapping
	public void delete(@RequestParam("id") long id) {
		
		repo.deleteById(id);
	}

}
