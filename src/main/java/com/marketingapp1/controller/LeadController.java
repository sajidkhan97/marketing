package com.marketingapp1.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.marketingapp1.entity.Lead;

import com.marketingapp1.service.LeadService;
import com.marketingapp1.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService service;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/create
	

	
	
	  @RequestMapping("/save")
	  public String viewLeadForm(@ModelAttribute Lead
	  lead,Model model) {
	   service.save(lead);
	   emailService.sendEmail("sajididrisi97@gmail.com", "welcome","heyyyy");
	  
	  model.addAttribute("successMessage", "Lead saved successfully!"); 
	  return "create_lead";
	  
	  }
	 
	/*
	 * @RequestMapping("/save") public String save(@RequestParam("firstName") String
	 * firstName,
	 * 
	 * @RequestParam("lastName") String lastName,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("mobile") String mobile ) { Lead lead = new Lead();
	 * lead.setFirstName(firstName); lead.setLastName(lastName);
	 * lead.setEmail(email); lead.setMobile(mobile); service.save(lead); return
	 * "create_lead"; }
	 */
	
	@RequestMapping("/create")
	public String view() {
		return "create_lead";
	}
	
	/*
	 * @RequestMapping("/save") public String leadDto(LeadDto l) { Lead lead = new
	 * Lead(); lead.setFirstName(l.getFirstName());
	 * lead.setLastName(l.getLastName()); lead.setEmail(l.getEmail());
	 * lead.setMobile(l.getMobile()); service.save(lead); return "create_lead";
	 * 
	 * }
	 */
	
	@RequestMapping("/listAll")
	public String listAll(Model model) {
		List<Lead> leads =service.listLeads();
		/*
		 * for (Lead lead : leads) { System.out.println(lead.getId());
		 * System.out.println(lead.getFirstName());
		 * System.out.println(lead.getLastName()); System.out.println(lead.getEmail());
		 * System.out.println(lead.getMobile());
		 * 
		 * 
		 * }
		 */
		model.addAttribute("leads", leads);
		
		return "list";
		
	}
	
	@RequestMapping("/delete")
	  public String deleteItem(@RequestParam("id") long id,Model model) {
	    
	    service.deleteItem(id);
	    List<Lead> leads = service.listLeads();
	    model.addAttribute("leads",leads);
	    return "list";
	  }
	
	@RequestMapping("/update")
	  public String updateItem(@RequestParam("id") long id,Model model) {
	    
	    Lead lead = service.findItem(id);
	    model.addAttribute("lead",lead);
	    
	    return "update";
	  }
	
	
	@RequestMapping("/updateLead")
	public String updateLead(@RequestParam("id") long id,@ModelAttribute Lead update) {
		
		Lead lead = service.findItem(id);
		
		
		lead.setFirstName(update.getFirstName());
		lead.setLastName(update.getLastName());
		lead.setEmail(update.getEmail());
		lead.setMobile(update.getMobile());
		service.save(lead);
		return "redirect:/listAll";
	}
	
	
	
	
	
	
	
	

	
		
	
	
	
	

}
