package com.cnf.nov21;
//Q2.Write a program to show the advantages of using  and encapsulation
//concepts.

public class StudentInfo  {

	public static void main(String[] args) {
		StudentPojo info = new StudentPojo();
		info.setStdId(01);
		info.setStdName("varsh");
		System.out.println("Name:"+ info.getStdId());
		System.out.println("Id:"+info.getStdName());
	}
	
	
}
