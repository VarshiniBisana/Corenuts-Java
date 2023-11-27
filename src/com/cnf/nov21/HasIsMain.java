package com.cnf.nov21;

public class HasIsMain {
	//  IS-A and HAS-A relationships

		    public static void main(String[] args) {
		        // Creating instances of Car and Engine
		        Car myCar = new Car("Toyota", 4);
		        Engine carEngine = new Engine("Petrol");

		        // Creating a CarWithEngine (HAS-A relationship)
		        CarWithEngine carWithEngine = new CarWithEngine(myCar, carEngine);

		        // Displaying information and invoking methods
		        System.out.println("Information about the Car:");
		        System.out.println("Brand: " + myCar.brand);
		        System.out.println("Number of Doors: " + myCar.numberOfDoors);
		        myCar.start();

		        System.out.println("\nInformation about the Engine:");
		        System.out.println("Engine Type: " + carEngine.type);
		        carEngine.run();

		        System.out.println("\nInformation about the Car with Engine:");
		        carWithEngine.start();
		    }
		

	}

