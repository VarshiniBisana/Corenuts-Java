package com.cnf.nov22;

//Q2.: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
public class Case2 {
	
		public void method1() {				
			try {
				int result = 89/0;
			} catch (ArithmeticException e) {
				System.out.println("Exception:"+e.getMessage());
			}
			}
			
		}

