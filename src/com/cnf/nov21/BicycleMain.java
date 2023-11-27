package com.cnf.nov21;
//Q6.Write a program to show the behavior of data binding using super &amp; sub class
//objects
public class BicycleMain {
	public static void main(String args[])  
    { 
    
        Bicycle mb2 = new MountainBike(4, 200, 20); 
          
        MountainBike mb1 = new MountainBike(3, 100, 25); 
          
        System.out.println("seat height of first bicycle is " 
                                            + mb1.seatHeight); 
              
        
        System.out.println(mb1.toString()); 
        System.out.println(mb2.toString()); 
  
       
    } 
} 

