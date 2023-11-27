package com.cnf.nov16;

public class Dell implements Laptop,AdvanceFeatures{
public static void main(String[] args) {			//Interface can extend multiple interfaces
//	Laptop lappy= new Dell();				//Laptop is used to create object to access methods in laptop 
	Dell lappy = new Dell();				//dell is used to access methods in both interfaces
//	AdvanceFeatures lappy = new Dell();		//advancefeatures is used to access methods in AdvancedFeatures
	lappy.Ram();
	lappy.Geneartion();
	lappy.Os();
	lappy.Touchscreen();
}
	@Override
	public void Ram() {
		System.out.println("RAM is 6.00 GB");
		
	}

	@Override
	public void Geneartion() {
		System.out.println("Generation is i5");
		
	}

	@Override
	public void Os() {
		System.out.println("OS is Windows");
		
	}
	public void Touchscreen() {
		System.out.println("It has TouchScreen option");
	}
	
	
	

}
