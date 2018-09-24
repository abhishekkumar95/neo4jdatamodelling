package com.stackroute.matchzone.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.model.FrontEnd;



@SuppressWarnings("unused")
public interface TechRepository extends Neo4jRepository<FrontEnd,Long> {
	
	
//	
//	@Query("MATCH (b:Html)<-[PartWholeOf]-(c:ajax) RETURN b,c ")
//	Collection<FrontEnd> graph();
//	//@Query("CREATE(Inception:Movie{title:'Inception',director:Christopher Nolan'})")
//	Collection<FrontEnd> getAllTech();
	@Query("CREATE(d:FRONTEND{name:'CSS',type:'frontend'})CREATE(a:BootStrap{name:'BootStrap',type:'frontend'})CREATE (a)-[:partWholeOf{roles:['as a prerequisite']}]->(d)CREATE(z:FRONTEND{name:'FrontEnd',type:'Category'})CREATE (d)-[:partWholeOf{roles:['as a prerequiste']}]->(z)CREATE(h:HTML{name:'HTML',type:'FRONTEND'})CREATE (d)-[:partWholeOf{roles:['as a prerequiste']}]->(h)")
	//Collection <FrontEnd> create();
		public String create();

}
