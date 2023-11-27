package com.cnf.nov24;
//Q2.Write a program to get substring “CoreNuts Technologies“ from “CoreNuts
//Technologies Pvt ltd.”;

public class Substring1 {
public static void main(String[] args) {
	Substring1 sub = new Substring1();
	sub.substring();
}
public void substring() {
	String str = new String("CoreNuts Technologies Pvt ltd");
	System.out.println(str.substring(0,str.indexOf("Pvt")));
}
}
