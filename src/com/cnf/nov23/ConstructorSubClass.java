package com.cnf.nov23;
//Q2.Write a program that covers Constructor chaining ,this statement and super statement  and this and super keywords ?

public class ConstructorSubClass extends ConstructorSuperClass {
public ConstructorSubClass() {
	this("super","sub");
	System.out.println("Default comstructor of sub class");
}

public ConstructorSubClass(String string, String string2) {
	super();
	System.out.println("Parameterized constructor of sub class");
}

	
}
