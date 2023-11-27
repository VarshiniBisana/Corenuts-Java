package com.cnf.nov16;

public class AdvanceFeaturesAbstract extends LaptopAbstract {

	@Override
	void Generation() {								//abstract can extend only 1 class
		System.out.println("The Generation is i3");
		
	}
	
	public static void main(String[] args) {
		LaptopAbstract ref  = new AdvanceFeaturesAbstract();
		ref.Generation();
		ref.OS();
	}

}
