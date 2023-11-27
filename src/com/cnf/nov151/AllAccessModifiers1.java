package com.cnf.nov151;
import com.cnf.nov15.AllAccessingModifers;
public class AllAccessModifiers1 extends AllAccessingModifers {

	    public static void main(String[] args) {
	    	AllAccessModifiers1 ref= new AllAccessModifiers1();

	        //  variables
//	        System.out.println("Public variable: " + ref.publicVariable);
	        System.out.println("Protected variable: " + ref.protectedVariable);// protected can be accessed only through inheritance
//	        System.out.println("Default variable: " + ref.defaultVariable); //default can be only accessed within the package
	        // Private variable is not accessible from AnotherClassInDifferentPackage

	        //  methods
	        ref.publicMethod();
        ref.protectedMethod();
//	        ref.defaultMethod();
	        // Private method is not accessible from AnotherClassInDifferentPackage
	    }
	    
	    
	}


