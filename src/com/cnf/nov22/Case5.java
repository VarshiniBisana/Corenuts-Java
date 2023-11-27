package com.cnf.nov22;
//Q5.If SuperClass declares an exception and SubClass declares without exception
public class Case5 {
	
	public void method1() throws ArithmeticException {				
		try {
			int result = 89/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		}
}
