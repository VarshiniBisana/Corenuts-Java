package com.cnf.nov22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


//Q1.If SuperClass doesn’t declare any exception and subclass declare checked exception
public class Case11 extends Case1 {
//	@Override
//	public void method1 ()throws FileNotFoundException {				//superclass also should throw checked exception
//		System.out.println("method1");
//		}
		
//	public void method2() throws FileNotFoundException{				
//		String file_name = "C:\\Users\\Raj\\Desktop\\corenuts notes\\weekly assessments1";								
//		try(FileInputStream file = new FileInputStream("File: "+file_name)) {			
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found please check the address");
//		}
	
	public static void main(String[] args)  {		
		Case11 refthrow = new Case11();
		try{
			refthrow.method1();	
		}
		catch(Exception e){
			System.out.println("Exception :"+ e.getMessage());
		}
		
		}
}
