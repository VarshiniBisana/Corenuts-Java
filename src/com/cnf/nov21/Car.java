package com.cnf.nov21;

public class Car extends Vehicle {
	//  (IS-A relationship)
		    int numberOfDoors;

		    public Car(String brand, int numberOfDoors) {
		        super(brand);
		        this.numberOfDoors = numberOfDoors;
		    }

		    // Overriding the start method
		    @Override
		    public void start() {
		        System.out.println("Car is starting");
		    }
		}

