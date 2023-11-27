package com.Assign.Nov8;

import java.util.Arrays;

public class ArrayAllDataTypes {
	public static void main(String[] args) {
		ArrayAllDataTypes.Interger();
		ArrayAllDataTypes.Byte();
		ArrayAllDataTypes.shortt();
		ArrayAllDataTypes.Double();
		ArrayAllDataTypes.Float();
		ArrayAllDataTypes.longg();
		ArrayAllDataTypes.Boolean();
		ArrayAllDataTypes.Charcter();
	}
	
	public static  void Byte() {
		byte[] bytearray = new byte[3];		//to assign the array length
		bytearray[0]=14;							//	assigning  to array one by one
		bytearray[1]=25;
		bytearray[2]=67;
		String stringArr = Arrays.toString(bytearray);
		System.out.println(stringArr);
	}
	public static  void shortt() {
		short[] shortarray = new short[3];		//to assign the array length
		shortarray[0]=143;							//	assigning  to array one by one
		shortarray[1]=254;
		shortarray[2]=773;
		String stringArr = Arrays.toString(shortarray);
		System.out.println(stringArr);
	}
	public static  void Interger() {
		int[] shortarray = new int[3];		//to assign the array length
		shortarray[0]=143;							//	assigning  to array one by one
		shortarray[1]=254;
		shortarray[2]=773;
		String stringArr = Arrays.toString(shortarray);
		System.out.println(stringArr);
	}
	
	public static  void longg() {
		long[] longarray = new long[3];		//to assign the array length
		longarray[0]=14783;							//	assigning  to array one by one
		longarray[1]=25234;
		longarray[2]=67325;
		String stringArr = Arrays.toString(longarray);
		System.out.println(stringArr);
	}
	public static  void Double() {
		double[] doubarray = new double[3];		//to assign the array length
		doubarray[0]=14.783;							//	assigning  to array one by one
		doubarray[1]=25.234;
		doubarray[2]=67.325;
		String stringArr = Arrays.toString(doubarray);
		System.out.println(stringArr);
	}
	public static  void Float() {
		float[] doubarray = new float[3];		//to assign the array length
		doubarray[0]=14.783f;							//	assigning  to array one by one
		doubarray[1]=25.234f;
		doubarray[2]=67.325f;
		String stringArr = Arrays.toString(doubarray);
		System.out.println(stringArr);
	}
	public static  void Boolean() {
		boolean[] shortarray = new boolean[3];		//to assign the array length
		shortarray[0]=false;							//	assigning  to array one by one
		shortarray[1]=true;
		shortarray[2]=false;
		String stringArr = Arrays.toString(shortarray);
		System.out.println(stringArr);
	}
	public static  void Charcter() {
		char[] shortarray = new char[3];		//to assign the array length
		shortarray[0]='c';							//	assigning  to array one by one
		shortarray[1]='f';
		shortarray[2]='s';
		String stringArr = Arrays.toString(shortarray);
		System.out.println(stringArr);
	}

}