package com.cnf.nov21;
//Q8.Write a program to implement multi level inheritance and then access super
//class properties through sub class objects.

public class Animals {
	 String name;

	    public Animals(String name) {
	        this.name = name;
	    }

	    void eat() {
	        System.out.println(name + " is eating");
	    }
	}

