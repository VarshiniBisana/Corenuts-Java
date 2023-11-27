package com.cnf.nov23;
//Q5.. Write a program to initialize static variables through constructor and print them?
public class StaticVariables {

	static  String name;
	
	public StaticVariables(String name) {
		this.name= name;
	}
	
	public static void main(String[] args) {
		StaticVariables sta = new StaticVariables("Varshini");
		System.out.println(sta.name);
	}
	}


