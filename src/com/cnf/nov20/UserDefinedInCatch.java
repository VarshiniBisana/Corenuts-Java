package com.cnf.nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Q3.Write a program to raise the user defined exception from catch block
public class UserDefinedInCatch {
public static void main(String[] args) throws Exception {
UserDefinedInCatch usedef = new UserDefinedInCatch();
try {
	usedef.method1();
} catch (Exception e) {
System.out.println("Exception:"+e.getMessage());
} 
}

private void method1() throws Exception {
	try(FileInputStream stream = new FileInputStream("C:\\Users\\Raj\\Desktop\\corenuts notes\\Programs1");) {
		
	}
	catch (Exception e) {
	throw new UserPasswordException("File not found");
	}
	
}

}
