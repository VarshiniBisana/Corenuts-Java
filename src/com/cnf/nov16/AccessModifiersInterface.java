package com.cnf.nov16;

public interface AccessModifiersInterface {

	public void publicMethod();
	
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	 default void defaultMethod()
	 {
		 System.out.println("default Method");
	 }
	
///	protected void protectedMethod();			//illegal modifiers
	
}
