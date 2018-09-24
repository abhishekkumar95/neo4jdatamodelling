package com.stackroute.matchzone.controller;

import com.stackroute.matchzone.exception.NodeNotCreatedException;
//import com.stackroute.matchzone.model.FrontEnd;
import com.stackroute.matchzone.service.TechServiceImpl;

//import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rest/neo4j")
public class Controller {
	
	
	 private TechServiceImpl  techService;
	@Autowired
	public Controller(TechServiceImpl techService) {
		
		this.techService = techService;
	}

	

	/** This handler method should map to the URL "api/v1/rest/neo4j/tech" using HTTP POST
      method".**/
	@PostMapping("/tech")
	
	public String saveAllNode(){
		String frontEnd=null;
		try {
			frontEnd=  techService.saveAll();
		} catch (NodeNotCreatedException e) {
			
			
			e.getMessage();
			
		}
		return  frontEnd;
			
		}
	
	
		
	}
	

	
	
	

