package com.cnf.nov21;
//Q6.Write a program to show the behavior of data binding using super &amp; sub class
//objects

public class Bicycle {
 
    public int gear; 
    public int speed; 
          
  
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
     
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 

