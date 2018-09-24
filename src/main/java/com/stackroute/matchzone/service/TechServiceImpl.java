package com.stackroute.matchzone.service;

//import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.exception.NodeNotCreatedException;
//import com.stackroute.matchzone.model.FrontEnd;
import com.stackroute.matchzone.repository.TechRepository;

@Service
public class TechServiceImpl implements TechService {

	
	
	 private TechRepository techRepository;
	@Autowired
	public TechServiceImpl(TechRepository techRepository) {
		
		this.techRepository = techRepository;
	}
	
	
//	 This method should be used to save a new node.Call the corresponding
//    * method of Respository interface.
	
	
public String saveAll() throws NodeNotCreatedException {
		
		
		String status=  techRepository.create();
		if(status!= null)
		return  status;
		else
			throw new NodeNotCreatedException();
	}

	

}
