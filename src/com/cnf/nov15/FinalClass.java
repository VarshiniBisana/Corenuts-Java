package com.cnf.nov15;


	class FinalClass {
	    // Class implementation
	}

	// Another class within the same package attempting to extend the final class
	class SubclassInSamePackage extends FinalClass {
	    // Uncommenting the following line will result in a compilation error
	    /*
	    void subclassMethod() {
	        System.out.println("Subclass method in the same package.");
	    }
	    */
	}

	
	
