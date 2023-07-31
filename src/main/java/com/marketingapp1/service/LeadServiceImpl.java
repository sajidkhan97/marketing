package com.marketingapp1.service;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.marketingapp1.entity.Lead;
import com.marketingapp1.repository.LeadRepository;


@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository repo;

	@Override
	public void save(Lead lead) {
		repo.save(lead);
		
		

	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads =repo.findAll();
		return leads;
	}

	@Override
	public void deleteItem(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Lead findItem(Long id) {
		Optional<Lead> findById = repo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}
	


	
	


	
	
	

}
