package com.cnf.nov9;

public class BODMAS {

	public static void main(String[] args) {
		BODMAS bodmas = new BODMAS();
		bodmas.bodmas();
		}
	
	public double bodmas() {
		int num1=35;
		int num2=6;
		double num3=8.2;
		byte num4=2;
		
		double result= num1/num2*num3-(3+5);
		System.out.println(result);
		return result;
		
	}
}
