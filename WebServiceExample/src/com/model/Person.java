package com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	public int id;
	public String name;
	public String year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String toString(){
		return id+"::"+name+"::"+year;
	}

}
