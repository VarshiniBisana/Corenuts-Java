package com.cnf.nov21;

public class Rectangle extends Shape{

	@Override
	public void diameter() {
		System.out.println("The diameter of rectangle is 30");
		
	}

	@Override
	public void colour() {
		System.out.println("The colour is orange");
		
	}

	public void colour(String colour) {
		System.out.println("The colour is pink");
		
	}
	
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.colour();
		shape.colour(null);
		shape.diameter();
		shape.dimension();
	}

}
