package com.cnf.nov21;
//Q1.Declare classes Animal(parent) and Dog(subclass) and then provide the parent &;
//child relation between them. Access the Animal class properties in Dog class.

public class Animal {

	public void barking() {
		System.out.println("Dog always Barks");			
	}
	public void bitting() {
		System.out.println("Dog always Bites");
	}
	public void barking(String st) {
		System.out.println("Dog always barks and bites" /*+st*/);
	}
	
}
