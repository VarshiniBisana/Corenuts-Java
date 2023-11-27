package com.cnf.nov22;
//Q4.If SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception
public class Case44 extends Case4{
	@Override
	public void method1() throws ArithmeticException{				
		try {
			int result = 89/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		}
	public static void main(String[] args)  {		
		Case44 refthrow = new Case44();
		try{
			refthrow.method1();	
		}
		catch(Exception e){
			System.out.println("Exception :"+ e.getMessage());
		}
		
		}
}
