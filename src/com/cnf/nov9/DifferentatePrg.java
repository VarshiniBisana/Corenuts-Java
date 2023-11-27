package com.cnf.nov9;

public class DifferentatePrg {
public static void main(String[] args) {
	DifferentatePrg difference = new DifferentatePrg();
	difference.DoubleS(7, 9);
	difference.SingleS(14, 4);
}
public void DoubleS(int value1,int value2){
	 boolean result = (value1 >= value2)&&(value1==value2);
	 System.out.println("&&:"+result);//false
	
}
public void SingleS(int value1,int value2) {
	int result = value1 & value2;
	System.out.println(result);
}
}
