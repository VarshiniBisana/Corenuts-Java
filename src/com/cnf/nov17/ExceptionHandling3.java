package com.cnf.nov17;
//Q3.Write a program to handle the exception in try, catch, finally blocks?
public class ExceptionHandling3 {
public static void main(String[] args) {
	try {
		int arr[]= null;
		System.out.println(arr.length);
	} catch (NullPointerException e) {
		System.out.println("Null Pointer Exception"+" "+ e.getMessage());
	}
	finally {
		System.out.println("Finally block");
		System.out.println("End ");
	}
}
}
