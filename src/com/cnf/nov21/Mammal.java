package com.cnf.nov21;
//Q8.Write a program to implement multi level inheritance and then access super
//class properties through sub class objects.

	class Mammal extends Animals {
	    public Mammal(String name) {
	        super(name);
	    }

	    void giveBirth() {
	        System.out.println(name + " is giving birth");
	    }
	}


