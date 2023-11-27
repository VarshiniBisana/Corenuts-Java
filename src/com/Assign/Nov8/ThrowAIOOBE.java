package com.Assign.Nov8;

public class ThrowAIOOBE {
	public static void main(String[] args) {
		ThrowAIOOBE.throwExcpection();
	}
	public static void throwExcpection() {
	int[] intarray = new int[4];		//to assign the array length
	intarray[0]=14;							//	assigning  to array one by one
	intarray[1]=25;
	intarray[2]=67;
	intarray[3]=75;
	intarray[4]=89;
	System.out.println(intarray[5]);  	//the array index is more then the innput so we'll get Array out of boundery
	System.out.println(intarray[3]);
}
}