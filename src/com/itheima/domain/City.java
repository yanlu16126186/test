package com.itheima.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("city")
public class City {
	@XStreamAsAttribute
	private String name;
	@XStreamAsAttribute
	private String description;
	
	public City(){}
	
	
	public City(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
