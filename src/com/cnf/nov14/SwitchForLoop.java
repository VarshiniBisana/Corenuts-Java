package com.cnf.nov14;

public class SwitchForLoop {
public static void main(String[] args) {
	SwitchForLoop case1 = new SwitchForLoop();
	case1.switchcase();
}
public void switchcase() {
	char ch='A';
	for(int num=1;num<6;num++) {
		
	
	switch(ch)
	{
	case'A':
		System.out.println("Bengaluru");
//		break;
	case'B':
		System.out.println("Kerala");
//		break;
	case'C':
		System.out.println("AndraPradesh");
//		break;
	case'D':
		System.out.println("chennai");
//		break;
	case'E':
		System.out.println("Uttarpradesh");
//		break;
	default:
		System.out.println("Default");
}
}
}}