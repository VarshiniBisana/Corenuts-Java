package com.cnf.nov20;



public class CallerMethod {
public static void main(String[] args) {
	CallerMethod cm =  new CallerMethod();
//	cm.method1();
	cm.method2();
}

private void method2() {
	// TODO Auto-generated method stub
	method1();
	
}

private void method1() {
	try {
		int arr[]= new int[5];
		System.out.println(arr[7]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Exception:"+e.getMessage());
	}
	
}

}
