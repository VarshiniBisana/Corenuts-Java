package com.cnf.nov16;

public class Mathfunction  implements Calculate{
	
	public static void main(String[] args) {
		Calculate object = new Mathfunction();
		object.addition();
		object.Subtraction();
		object.Multiplication();
		object.Division();
		object.Module();
		
	}

	@Override
	public void addition() {
		int sum = num1+num2;
		System.out.println("Addition:"+" "+sum);
		
	}

	@Override
	public void Subtraction() {
		int sub= num1-num2;
		System.out.println("Subtraction"+" "+sub);
		
	}

	@Override
	public void Multiplication() {
		int mul= num1*num2;
		System.out.println("Multiplication"+" "+mul);
		
	}

	@Override
	public void Division() {
		int sub= num1/num2;
		System.out.println("Division"+" "+sub);
		
	}

	@Override
	public void Module() {
		int sub= num1%num2;
		System.out.println("Module"+" "+sub);
		
	}


	
}
