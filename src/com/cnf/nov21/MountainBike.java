package com.cnf.nov21;
//Q6.Write a program to show the behavior of data binding using super &amp; sub class
//objects

	class MountainBike extends Bicycle  
	{ 
	      
	    public int seatHeight;  
	    public MountainBike(int gear,int speed, 
	                        int startHeight) 
	    { 
	        
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	          
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    }  
	      
	    // overriding toString() method 
	    // of Bicycle to print more info 
	    @Override
	    public String toString()  
	    { 
	          
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	      
	} 
	  

