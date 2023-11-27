package com.cnf.nov24;
//Q.4. Write a program to compare string values instead of address of string objects
public class StringValue {
public static void main(String[] args) {
	String s1 = "Mango";
	String s2 = "Apple";
	String s3 = new String ("Mango");
	String s4 = new String("Apple");
	String s5 = "Mango";
	String s6 = new String("Apple");
	
	System.out.println(s1.equals(s2));//falses
	System.out.println(s2.equals(s3));//false
	System.out.println(s3.equals(s4));//false
	System.out.println(s4.equals(s1));//false
	System.out.println(s2.equals(s5));//false
	System.out.println(s3.equals(s1));//true
	System.out.println(s1.equals(s5));//true
	System.out.println(s4.equals(s6));//true
	
}
}
