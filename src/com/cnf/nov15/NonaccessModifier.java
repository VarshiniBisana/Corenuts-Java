package com.cnf.nov15;

public  abstract class NonaccessModifier {

	final int num1=45;
	final static int num2=67;						//variable level
//	abstract int  num3= 45;  //illegal modifiers
	
	public final void class1() {
		System.out.println("final class");
	}
	public final static void class2() {
		System.out.println("final static class");
	}
	abstract void class3();
	
	
	
	public static void main(String[] args) {
//		NonaccessModifier ref = new NonaccessModifier() {
																//abstract class we cannot create a object
		}
	
}


