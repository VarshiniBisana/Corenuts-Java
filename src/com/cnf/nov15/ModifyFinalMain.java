package com.cnf.nov15;

public class ModifyFinalMain {
	public class Main {
	
	    public static void main(String[] args) {
	       
	        ModifyFinal exampleObj = new ModifyFinal();
	        exampleObj.tryToModify();

	        
	        AnotherClass anotherObj = new AnotherClass();
	        anotherObj.tryToModify(exampleObj);
	    }
	}

}
