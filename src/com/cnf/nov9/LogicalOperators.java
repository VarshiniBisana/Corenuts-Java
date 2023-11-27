package com.cnf.nov9;

public class LogicalOperators {
public static void main(String[] args) {
	LogicalOperators logical = new LogicalOperators();
	logical.AND(10,12);
	logical.OR(4,5);
	logical.notequal(4, 4);
}

public void AND(int value1, int value2) {
	boolean result = (value1 > value2)&&(value1==value2);//false
	System.out.println(result);
}
public void OR(int value1, int value2) {
	boolean result = (value1> value2)||(value1<=value2);
	System.out.println(result);//true
}
public void notequal(int value1, int value2) {
	boolean result = value1!= value2;
	System.out.println(result);//false
}
}

