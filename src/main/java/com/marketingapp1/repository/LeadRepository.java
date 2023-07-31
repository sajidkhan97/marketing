package com.marketingapp1.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketingapp1.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

	

}
