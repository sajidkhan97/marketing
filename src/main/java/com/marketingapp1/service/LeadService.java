package com.marketingapp1.service;



import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import com.marketingapp1.entity.Lead;

public interface LeadService {
	
	
	
	public void save(Lead lead);

	public List<Lead> listLeads();

	public void deleteItem(Long id);

	public Lead findItem(Long id);

	

	


	
	

}
