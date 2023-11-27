package com.cnf.nov21;
//Q8.Write a program to implement multi level inheritance and then access super
//class properties through sub class objects.

public class MultipleLevelInheritance {
	 public static void main(String[] args) {
	        // Creating objects of each class
	        Animals animal = new Animals("Generic Animal");
	        Mammal mammal = new Mammal("Generic Mammal");
	        Dogs dog = new Dogs("Buddy");

	        
	        System.out.println("Accessing Animal properties through Mammal object:");
	        mammal.eat(); 

	        System.out.println("\nAccessing Animal properties through Dog object:");
	        dog.eat();   

	        System.out.println("\nAccessing Mammal properties through Dog object:");
	        dog.giveBirth(); 
	    }
}
