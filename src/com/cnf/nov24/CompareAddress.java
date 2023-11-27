package com.cnf.nov24;
//Q.3. Write a program to compare address of string objects
public class CompareAddress {
public static void main(String[] args) {
	String s1 = "Mango";
	String s2 = "Apple";
	String s3 = new String ("Mango");
	String s4 = new String("Apple");
	String s5 = "Mango";
	String s6 = new String("Apple");
	
	System.out.println(s1==s2);//false
	System.out.println(s2==s3);//false
	System.out.println(s3==s4);//false
	System.out.println(s4==s1);//false
	System.out.println(s2==s4);//false
	System.out.println(s3==s1);//false
	System.out.println(s1==s5);//true
	System.out.println(s4==s6);//false


}
}
