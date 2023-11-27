package com.cnf.nov16;

public class AccessModifierInterface1 implements AccessModifiersInterface {

	@Override
	public void publicMethod() {
		System.out.println("public method");
		
	}
	public static void main(String[] args) {
		
		AccessModifiersInterface ref = new 	 AccessModifierInterface1();
		ref.defaultMethod();
		ref.publicMethod();
		
	}

}
