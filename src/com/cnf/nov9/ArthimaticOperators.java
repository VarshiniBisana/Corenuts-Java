package com.cnf.nov9;

public class ArthimaticOperators {
	
public static void main(String[] args) {
	
	ArthimaticOperators arthimatic = new ArthimaticOperators();
	arthimatic.addition(4, 5);
	arthimatic.Subtraction(50, 45);
	arthimatic.Multiplication(3.5, 5.7);
	arthimatic.Division(10, 100);
	arthimatic.Modules(35, 46);
}
	public  int addition(int value1,int value2) {
	int result= (value1+value2)+(value1+15);
	System.out.println("Addition:"+result);
	return result;
	}
		
	public double Subtraction(int value1,double value2) {
		double result=(value1-value2)-(value1+10);
		System.out.println("Subtraction:"+result);
		return result;
	}
	
	public double Multiplication(double value1,double value2) {
		double result=(value1*value2)*10;
		System.out.println("Multiplication:"+result);
		return result;
	}
	public double Division(int value1,int value2) {
		double result=value1/value2;
		System.out.println("Division:"+result);
		return result;
	}
	
	public double Modules(int value1,int value2) {
	double result=value1%value2;
	System.out.println("Modulus"+result);
		return result;
	}
}