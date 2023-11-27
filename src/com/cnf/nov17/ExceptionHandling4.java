package com.cnf.nov17;

import com.cnf.nov9.ArthimaticOperators;

//Q4.Write a program to handle the exception in finally without using catch block?
public class ExceptionHandling4 {
public static void main(String[] args) {
	try {
		int num=23/0;
		System.out.println("Arthimatic exception");
	} 
	finally {													//without catch exception is not handlednclas
		System.out.println("final");
		try {
			int sum = 23/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
}
