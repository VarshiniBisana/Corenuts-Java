package com.cnf.nov21;

public class CarWithEngine {
	// Class representing a Car with an Engine (HAS-A relationship)
	
		    Car car;
		    Engine engine;

		    public CarWithEngine(Car car, Engine engine) {
		        this.car = car;
		        this.engine = engine;
		    }

		    public void start() {
		        System.out.println("Car with Engine is starting");
		        car.start();  // Delegating start operation to the Car
		        engine.run(); // Starting the engine
		    }
		}

