package com.stackroute.matchzone.model;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class FrontEnd {
	 @Id @GeneratedValue
	private Long id;
	private String title;
	private Integer type;
	
	@Relationship(type="partWholeOf" , direction=Relationship.INCOMING)
	private List<Html>tech;
	
	
	
	
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




	public Integer getType() {
		return type;
	}




	public void setType(Integer type) {
		this.type = type;
	}




	public List<Html> getTech() {
		return tech;
	}




	public void setTech(List<Html> tech) {
		this.tech = tech;
	}




	//	public Long getId() {
//		return id;
//	}
//	public List<Html> getMovies() {
//		return movies;
//	}
//	public void setMovies(List<Html> movies) {
//		this.movies = movies;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}
	

}
