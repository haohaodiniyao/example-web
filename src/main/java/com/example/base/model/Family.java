package com.example.base.model;

import java.util.List;

public class Family {
	private Person father;
	private List<Person> childs;
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public List<Person> getChilds() {
		return childs;
	}
	public void setChilds(List<Person> childs) {
		this.childs = childs;
	}
	
}
