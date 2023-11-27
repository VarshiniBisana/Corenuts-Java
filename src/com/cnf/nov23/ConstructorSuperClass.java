package com.cnf.nov23;
//Q2.Write a program that covers Constructor chaining ,this statement and super statement  and this and super keywords ?

public class ConstructorSuperClass {

	public ConstructorSuperClass() {		//default constructor
		this(3,9);
		System.out.println("Default constructor in super class");
	}

	public ConstructorSuperClass(int i, int j) {
		System.out.println("Parameterized Constructor in super class");
	}
	
}
