package com.Assign.Nov8;

import java.util.Arrays;

public class NameChar {
public static void main(String[] args) {
NameChar.Name();	

}

public static void Name() {
	char[] name = new char[8];
	name[0]='v';
	name[1]='a';
	name[2]='r';
	name[3]='s';
	name[4]='h';
	name[5]='i';
	name[6]='n';
	name[7]='i';
	String stringArr = Arrays.toString(name);
	System.out.println(stringArr);
}
	
	
}

