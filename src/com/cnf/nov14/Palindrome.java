package com.cnf.nov14;

public class Palindrome {
public static void main(String[] args) {
	int num1,sum=0,temp;    
	  int num2=454;//It is the number variable to be checked for palindrome  
	  
	  temp=num2;    
	  while(num2>0){    
	   num1=num2%10;    
	   sum=(sum*10)+num1;    
	   num2=num2/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("The number is palindrome number ");    
	  else    
	   System.out.println("The number is not a  palindrome number");    
	}  
	
}

