package com.cnf.nov20;

public class CallerClass1 {
  public void method2() {
	  try {
		int arr[]= {1,4,4};
		System.out.println(arr[6]);
	} catch (IndexOutOfBoundsException e) {
		System.out.println("Exception:"+ e.getMessage());
	}
  }
}
