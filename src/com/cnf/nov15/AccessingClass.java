package com.cnf.nov15;

public class AccessingClass {
public static void main(String[] args) {
	AccessingClass obj = new AccessingClass();
	 obj.data();
	obj.data1();
	
	
}
public void  data() {
	int StdId=11;
	String StdName="Varshini";	
	System.out.println(StdId+" "+StdName);
	
}

public void data1() {
	int EmpId=12;
	String EmpName="bisana";
	System.out.println(EmpId+" "+EmpName);
}
}
