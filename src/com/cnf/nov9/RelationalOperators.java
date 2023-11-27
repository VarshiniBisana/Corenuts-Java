package com.cnf.nov9;

public class RelationalOperators {
public static void main(String[] args) {
	RelationalOperators relation = new RelationalOperators();
	relation.lessthen(34, 57);
	relation.greaterthen(45, 40);
	relation.lessthenequal(65, 43);
	relation.greaterthenequal(97, 30);
	relation.notequal(97, 56);
}
public void lessthen(int value1, int value2) {
	boolean result = value1< value2;
	System.out.println(result);
}
public void greaterthen(int value1, int value2) {
	boolean result = value1> value2;
	System.out.println(result);
}
public void lessthenequal(int value1, int value2) {
	boolean result = value1<= value2;
	System.out.println(result);
}
public void greaterthenequal(int value1, int value2) {
	boolean result = value1>= value2;
	System.out.println(result);
}
public void notequal(int value1, int value2) {
	boolean result = value1!= value2;
	System.out.println(result);
}

}
