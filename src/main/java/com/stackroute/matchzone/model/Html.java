package com.stackroute.matchzone.model;

import org.neo4j.ogm.annotation.GeneratedValue;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Html {

	//@GraphId
	 @Id @GeneratedValue
	private Long id;
	private String  title;
	private String type;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getDirector() {
//		return director;
//	}
//	public void setDirector(String director) {
//		this.director = director;
//	}
//	
	
	
	
}
