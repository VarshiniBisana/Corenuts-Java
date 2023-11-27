package com.cnf.nov22;
//Q5.If SuperClass declares an exception and SubClass declares without exception

public class Case55 extends Case5 {
	@Override
	public void method1() {				
		try {
			int result = 89/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		}
	public static void main(String[] args)  {		
		Case55 refthrow = new Case55();
		try{
			refthrow.method1();	
		}
		catch(Exception e){
			System.out.println("Exception :"+ e.getMessage());
		}
		
		}
}
