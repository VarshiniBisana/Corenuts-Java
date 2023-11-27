package com.cnf.nov10;

public class MultipleOf3 {
public static void main(String[] args) {
MultipleOf3 multi = new MultipleOf3();
multi.UsingDoWhile();
multi.UsingFor();
multi.UsingWhile();
}
	
	
public void UsingWhile() {	
	int i = 1;
	while (i <= 10) {
		if (i % 2 != 0) {
			System.out.println("3*" + i + "=" + (3 * i));

		}
		i++;
	}}

	public void UsingDoWhile(){
	int i = 1;
	do {
		if (i % 2 != 0) {

			System.out.println("3*" + i + "=" + (3 * i));
		}
		i++;
	} while (i <= 10);
	}

	public void UsingFor() {

	for (int i = 1; i <= 10; i++) {
		if (i % 2 != 0)
			System.out.println("3*" + i + "=" + (3 * i));

	}
}
	}


