package com.cnf.nov17;
//Q1. Write a program to handle exception using try and catch block
public class ExceptionHandling1 {
public static void main(String[] args) {
	try {
		int arr[]= new int[4];
		System.out.println(arr[6]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexoutofBoundaryException"+e.getMessage());
	}
	
}
}
