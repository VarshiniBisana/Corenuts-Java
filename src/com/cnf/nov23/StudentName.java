package com.cnf.nov23;

public class StudentName {

@Override
	public String toString() {
		return "StudentName [name=" + name + "]";
	}
String name;

public StudentName(String name) {
	super();							
	this.name = name;					//constructor field
}
public StudentName() {
	
	if(name==null) {
		this.name="unknown";			//default constuctor
	}
}



}
