package com.cnf.nov24;
//Q5.. Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different
//ways (on only string object)

public class ReverseString {
public static void main(String[] args) {
	String str = "CoreNuts Technology Pvt ltd";
	 {
		 
//		 System.out.println(str);
		 String reverse="";
	char[] str2 = str.toCharArray();
//	 System.out.println(str2);
	 for(int i = str2.length-1;i>=0;--i) {
		 reverse = reverse+ str2[i];
	 }
System.out.println(reverse);	 
	 }
	 
	 StringBuffer buff = new StringBuffer(str);
	 StringBuffer ar1= buff.reverse();
	 System.out.println(ar1);
}
}
