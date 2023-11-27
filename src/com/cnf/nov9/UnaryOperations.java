package com.cnf.nov9;

public class UnaryOperations {
public static void main(String[] args) {
	UnaryOperations operation = new UnaryOperations();
	operation.preIncrementNpostIncrement(7);
	operation.preDecrementNpostDecrement(15);
	operation.incrementNDecrement(20);
}

public void preIncrementNpostIncrement(int value1) {
	int result = value1++;
	System.out.println(value1++);					// 8
	++value1;
	System.out.println(++value1);					//10
			
}

public void preDecrementNpostDecrement(int value) {
 int result= value--;
 System.out.println(--value);			//13
 value--;
 System.out.println(value--);			//12
		 
}

public void incrementNDecrement(int value) {
	int result= value++;
	value--;
	System.out.println(++value);//21
	--value;
	++value;
	System.out.println(value++);//21
}
}
