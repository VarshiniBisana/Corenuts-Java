package com.cnf.nov22;

import java.io.IOException;

import com.cnf.nov9.ArthimaticOperators;

//Q3.If SuperClass declares an exception and SubClass declares exceptions
//other than the child exception of the SuperClass declared Exception.

public class Case3 {
	
	public void method1() throws ClassNotFoundException  {				
		try {
			int result = 89/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		}
	
}
