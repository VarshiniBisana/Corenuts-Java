package com.cnf.nov21;
//Q4.Q4.Write a program to show dynamic polymorphism (Overriding) behavior with all rules
//and show the advantage of using that.
public class AtomicHabits extends Book{

	public void genre() {
		System.out.println("The book is non-fiction");
	}
	
	public void pages() {
		System.out.println("The total pages of this boook is 350 ");
	}
	
	public static void main(String[] args) {
		Book book = new AtomicHabits();
		book.genre();
		book.pages();
//		book.year();
	}
}
