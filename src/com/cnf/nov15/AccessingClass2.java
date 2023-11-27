package com.cnf.nov15;

public class AccessingClass2 extends AccessingClass {
public static void main(String[] args) {
	
	AccessingClass2 ref1 = new AccessingClass2();
	ref1.data();
	ref1.data1();
	ref1.data4();
	ref1.data3();
}
	
	public void data3() {
		int StdId= 10;
		String StdName ="Sai varshini";
		System.out.println(StdId+" "+StdName);
	}
	public void data4() {
		int CrId=13;
		String CrName="Bindu";
		System.out.println(CrId+" "+CrName);
	}
}
