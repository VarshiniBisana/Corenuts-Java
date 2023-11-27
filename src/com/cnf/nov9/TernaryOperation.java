package com.cnf.nov9;

public class TernaryOperation {
public static void main(String[] args) {
TernaryOperation conduct = new TernaryOperation();
conduct.condition(4, 3);

}

public String condition(int value1,int value2) {
	   String result = (value1<value2)?"Value1":"Value2";
	   System.out.println(result);
	   return result;
}
}