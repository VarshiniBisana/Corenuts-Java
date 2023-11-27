package com.cnf.nov20;
//Q2.Write a program to raise the user defined exception based on user condition from try
//block?

import com.cnf.nov20.*;

public class UserDefinedException {
	
public static void main(String[] args){
	UserDefinedException expref = new UserDefinedException();
	try {
		expref.Withdraw();
		
	} catch (Exception e) {
		System.out.println("Exception :"+ e.getMessage());
	}
	
	}

//	double balance =1000;
//	double withdraw =5000;


public void Withdraw() throws Exception {
	try {
		throw new UserPasswordException("Insufficent balance");
		
	} catch (UserPasswordException e) {
		System.out.println("Enter sufficient balance");
	}
	
}



}
