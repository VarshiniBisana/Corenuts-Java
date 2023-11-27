package com.cnf.nov22;

import java.io.IOException;

//Q4.If SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception
public class Case4 {

	
		public void method1() throws RuntimeException{				
			try {
				int result = 89/0;
			} catch (ArithmeticException e) {
				System.out.println("Exception:"+e.getMessage());
			}
			}
	}
