package com.cnf.nov15;

public class AcessModifiersExample {
	
	    public static void main(String[] args) {
	        
	        DefaultAccessClass defaultAccessObj = new DefaultAccessClass();
	        Subclass subclassObj = new Subclass();

	        
	        System.out.println("Accessing defaultVar from the same package: " + defaultAccessObj.defaultVar);
	        defaultAccessObj.defaultMethod();

	        
	        System.out.println("Accessing protectedVar from subclass: " + subclassObj.protectedVar);
	        subclassObj.protectedMethod();

	        
	        subclassObj.accessDefaultMembers();
	    }
	}

