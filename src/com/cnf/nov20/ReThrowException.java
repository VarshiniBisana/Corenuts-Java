package com.cnf.nov20;

import java.io.FileInputStream;

import com.cnf.nov9.ArthimaticOperators;

public class ReThrowException {
public static void main(String[] args) {
	ReThrowException Rethrow = new ReThrowException();
	try {
		Rethrow.method1();
	} catch (Exception e) {
		System.out.println("Exception:"+ e.getMessage());
	}
	
}

private void method1() {
	try {
		int rt= 345/0;
	} catch (ArithmeticException e ) {
		throw new ArithmeticException("Cant be divided by 0");
	}
	
	
}
}
