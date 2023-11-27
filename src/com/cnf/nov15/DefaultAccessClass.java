package com.cnf.nov15;

class DefaultAccessClass {
	
	  
	    int defaultVar = 10;

	    
	    void defaultMethod() {
	        System.out.println("This is a default method.");
	    }
	}

	// A class that extends DefaultAccessClass
	class Subclass extends DefaultAccessClass {
	    
	    protected int protectedVar = 20;

	   
	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }

	   
	    void accessDefaultMembers() {
	        System.out.println("Accessing defaultVar from subclass: " + defaultVar);
	        defaultMethod();
	    }
	}

	
	
