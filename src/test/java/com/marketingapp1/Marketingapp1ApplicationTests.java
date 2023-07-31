package com.marketingapp1;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marketingapp1.entity.Lead;
import com.marketingapp1.repository.LeadRepository;

@SpringBootTest
class Marketingapp1ApplicationTests {
	
	@Autowired
	private LeadRepository repo;
	
	@Test
	void save() {
		
		Lead l = new Lead();
		l.setFirstName("laura");
		l.setLastName("jonathan");
		l.setEmail("laura@gmail.com");
		l.setMobile("9876549834");
		repo.save(l);
		
	}
	
	
	
	

	
	/**@Test
	void exist() {
		boolean val=repo.existsById(1L);
		System.out.println(val);
	}*/
	
	@Test
	void find() {
		Optional<Lead> findById=repo.findById(1L);
		Lead l = findById.get();
		System.out.println(l.getId());
		System.out.println(l.getFirstName());
		System.out.println(l.getLastName());
		System.out.println(l.getMobile());
		System.out.println(l.getEmail());
		
	}


	


}
