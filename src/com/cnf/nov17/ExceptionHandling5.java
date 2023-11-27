package com.cnf.nov17;
//Q5.Write a program to handle multiple/specific exceptions using different catch blocks
public class ExceptionHandling5 {
public static void main(String[] args) {
	try {
			
		try{int arr[]=new int[4];
		System.out.println(arr[7]);
		}
		catch ( IndexOutOfBoundsException e) {
			System.out.println("Indexoutof Bound");
		}
		int result = 34/0;

	} catch (ArithmeticException e) {
		System.out.println("Arthimatic Exception is handled in 1st catch");
	}
	finally {
		System.out.println("finally block");
	}
	System.out.println("end");
	}
}

