package com.itheima.domain;

public class Person {
	private String name;
	private String gender;
        private String haha;
	
	public Person(){}
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
