package com.cnf.nov17;
//Q2.Write a program to raise ArithemticException and then handle that using try, catch
//blocks

import com.cnf.nov9.ArthimaticOperators;

public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		try {
			int num = 232/0;
		} catch ( ArithmeticException e) {
			System.out.println("exception"+e.getMessage());
		}
	}
}
