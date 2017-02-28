package com.example.base.model;

public class Person {
	private String name;
	private Person family;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getFamily() {
		return family;
	}
	public void setFamily(Person family) {
		this.family = family;
	}
	
}
