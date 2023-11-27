package com.Assign.Nov8;

import java.util.Arrays;

public class ArrayWithOutSize {
	
	public static void main(String[] args) {
		ArrayWithOutSize array = new ArrayWithOutSize();
		array.StringArray1();
	}

	public static void StringArray1() {
		String [] Stringarray1 = {"Mango","Apple","Grapes","Banana"};
		String  Stringarray11 []= {"Mango","Apple","Grapes","Banana"};

		Stringarray1[3]="Orange";						//overwritten the string
		Stringarray1[1]="CustardApple";
		System.out.println(Stringarray1[1]);
		System.out.println(Stringarray1[2]);
		System.out.println(Stringarray1[3]);
		System.out.println(Stringarray1[0]);
		String stringArr = Arrays.toString(Stringarray1);
		System.out.println(stringArr);
//		System.out.println();
		
		
}
}