package com.cnf.nov21;

public class Engine {
	//  (HAS-A relationship)
		
		    String type;

		    public Engine(String type) {
		        this.type = type;
		    }

		    public void run() {
		        System.out.println("Engine is running");
		    }
		}

