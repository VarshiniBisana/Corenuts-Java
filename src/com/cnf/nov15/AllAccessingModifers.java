package com.cnf.nov15;

public class AllAccessingModifers {

	    public int publicVariable = 56;
	    protected int protectedVariable = 32;
	    int defaultVariable = 24;
	    private int privateVariable = 65;

	    public void publicMethod() {
	        System.out.println("This is the Public method");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is the Protected method");
	    }

	    void defaultMethod() {
	        System.out.println("This is Default method");
	    }

	    private void privateMethod() {
	        System.out.println("This is Private method");
	    }
	}

	

