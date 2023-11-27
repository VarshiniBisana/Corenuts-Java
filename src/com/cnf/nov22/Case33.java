package com.cnf.nov22;

import java.io.FileNotFoundException;

import com.cnf.nov9.ArthimaticOperators;

public class Case33 extends Case3 {
//	@Override
//	public void method1() throws FileNotFoundException{				
//		try {
//			int result = 89/0;
//		} catch (ArithmeticException e) {
//			System.out.println("Exception:"+e.getMessage());
//		}
//		}
//	
	public static void main(String[] args)  {		
		Case33 refthrow = new Case33();
		try{
			refthrow.method1();	
		}
		catch(Exception e){
			System.out.println("Exception :"+ e.getMessage());
		}
		
		}
}
