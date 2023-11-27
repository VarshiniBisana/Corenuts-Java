package com.cnf.nov14;

public class FibonacciSeries {
public static void main(String[] args) {
	FibonacciSeries series = new FibonacciSeries();
	series.fibbonacci();
}
public void fibbonacci() {
	int num1=1;
	int num2=1;
	int num3;

	System.out.println(num1);
	System.out.println(num2);
	
	for(int i=0;i<20;i++) {
		num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
//		int sum=0;
//		sum=sum +num3;
		
	}
	
	
	
}
}
