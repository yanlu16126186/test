package com.itheima.domain;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

//Ê¡·Ý
@XStreamAlias("province")
public class Province {
	@XStreamAsAttribute
	private String name;
	@XStreamAsAttribute
	private String description;
	@XStreamImplicit(itemFieldName="city")
	private List<City> citys = new ArrayList<City>();
	
	
	public Province(){}
	
	public Province(String name, String description) {
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

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}
	
}
