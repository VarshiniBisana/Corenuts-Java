package com.cnf.nov22;
//Q2.: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
public class Case22 extends Case2 {
	@Override
	public void method1() throws ArithmeticException{				
		try {
			int result = 89/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		}
	public static void main(String[] args)  {		
		Case22 refthrow = new Case22();
		try{
			refthrow.method1();	
		}
		catch(Exception e){
			System.out.println("Exception :"+ e.getMessage());
		}
		
		}
}
