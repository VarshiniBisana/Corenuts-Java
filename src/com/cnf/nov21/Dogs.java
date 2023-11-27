package com.cnf.nov21;
//Q8.Write a program to implement multi level inheritance and then access super
//class properties through sub class objects.
	class Dogs extends Mammal {
	    public Dogs(String name) {
	        super(name);
	    }

	    void bark() {
	        System.out.println(name + " is barking");
	    }
	}

