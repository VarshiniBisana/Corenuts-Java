package com.cnf.nov21;

public class Dog extends Animal{
public static void main(String[] args) {
	Animal animalobj = new Dog();
	animalobj.bitting();
	animalobj.barking();
	animalobj.barking(null);			//overriding
}
}
