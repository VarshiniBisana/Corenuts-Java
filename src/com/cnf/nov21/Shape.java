package com.cnf.nov21;
//Q2.Write a program to show the advantages of using abstraction concepts.

public abstract class Shape {

public abstract void diameter(); 
	
public abstract void colour();

public void dimension () {
	System.out.println("The dimension of the shape is 1D");		//concrete method
}

public abstract void colour(String colour);

}
