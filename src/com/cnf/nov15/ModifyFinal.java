package com.cnf.nov15;

public class ModifyFinal {
	
	    final int finalVar = 10;
	     void tryToModify() {
	      System.out.println(finalVar);
	        // finalVar = 20;		compiletime error
	    }
	}

	
	class AnotherClass {
	    void tryToModify(ModifyFinal obj) {
	           // obj.finalVar = 30;   compiletime error
	    }
	}

	

