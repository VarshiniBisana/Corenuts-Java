package com.Assign.Nov8;

public class WaysToDeclareArray {
public static void main(String[] args) {

	WaysToDeclareArray.Way1();
	WaysToDeclareArray.Way2();
	WaysToDeclareArray.Way3(new int[]{23,43,54});
}

 public  static void  Way1() {
	 int value[]= new int[3];
	 value[0]=14;							//	assigning  to array one by one
	value[1]=25; 
	value[2]=67;
	
	System.out.println(value[0]);
	System.out.println(value[1]);
	System.out.println(value[2]);

	
 }
 
 public static void Way2() {
	 int[] intArray = {32,13,34};
	 System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
 }
 
 public static void Way3(int arr[]) {
	 System.out.println(arr[0]);
		System.out.println(arr[1]);							
		System.out.println(arr[2]);
 }
}
