package com.cnf.nov17;
//Q6.Write a program to handle multiple exceptions in a single catch block
public class ExceptionHandling6 {

public static void main(String[] args) {
	try {
	int res = 3/0;
//		int arr[]= null;
//		System.out.println(arr.length);
		
	} catch (ArithmeticException | NullPointerException e) {
		System.out.println("Multiple catch block"+e.getMessage());
	}
}
}
