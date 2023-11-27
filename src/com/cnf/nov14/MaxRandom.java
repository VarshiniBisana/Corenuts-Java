package com.cnf.nov14;
import java.util.Random;


public class MaxRandom {
public static void main(String[] args) {
	
Random random= new Random();
int number[]= new int[26];


//while(true) {													//while loop is used to run the loop infinite times
	for(int value1=0;value1<=25;value1++) {
	number[value1]=random.nextInt(100);
}

for(int value1=0;value1<=25;value1++) {
	int number2 =random.nextInt(100);

if(number[value1]<number2) {
	System.out.println(value1+" "+" is lesser then"+" "+number2);
}
else if(value1>number2) {
	System.out.println(value1+" "+" is greater"+" "+number2);
}
else if (value1==number2){
	System.out.println(value1+" "+" is equal to "+" "+number2);
}
}
}
}
//}
