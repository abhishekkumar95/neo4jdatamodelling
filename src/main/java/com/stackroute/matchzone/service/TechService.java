package com.stackroute.matchzone.service;



import com.stackroute.matchzone.exception.NodeNotCreatedException;


/**have to implement these methods in
     * corresponding Impl classes**/


public interface TechService {
	
	 //Collection<FrontEnd> saveAll() throws NodeNotCreatedException; 
	public String saveAll()throws NodeNotCreatedException; 
}
