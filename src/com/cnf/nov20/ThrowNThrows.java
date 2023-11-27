package com.cnf.nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.cnf.nov9.ArthimaticOperators;

//Q1.Write a program to throw checked exceptions using throw and throws 

public class ThrowNThrows {
	
public static void main(String[] args) throws Exception {		//we can use parent exception or same exception
	ThrowNThrows refthrow = new ThrowNThrows();
	try{
		refthrow.method1();	
	}
	catch(Exception e){
		System.out.println("Exception :"+ e.getMessage());
	}
	
	}

public void method1() throws Exception{				//we should give child exception
	String file_name = "C:\\Users\\Raj\\Desktop\\corenuts notes\\weekly assessments1";								//calledmethod
	try(FileInputStream file = new FileInputStream("File: "+file_name)) {			//condtion will bw closed if fileinputstram is inside try ()
	} catch (FileNotFoundException e) {
		throw new Exception("Please ensure the file exists");
	}
	
}


}
