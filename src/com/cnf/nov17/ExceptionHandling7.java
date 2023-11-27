package com.cnf.nov17;
//Q7.Write a program to handle the multiple exceptions using multiple try/catch/finally in same method?
import com.cnf.nov9.ArthimaticOperators;

public class ExceptionHandling7 {
public static void main(String[] args) {
	try {
		int num = 34/0;
		
	} catch (ArithmeticException e) {
		System.out.println("1st try,catch block");
	}
	try {
		int arr[]=  new int[7];
		System.out.println(arr[9]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("2nd try,catch block");
	}
	finally {
		System.out.println("Finally bloack");
	}
}
}
