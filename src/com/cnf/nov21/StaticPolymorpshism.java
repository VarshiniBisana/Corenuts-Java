package com.cnf.nov21;
//Q3.Overload functions (static polymorphism) in a class and access them using the class
//object. And also show the advantage of using overloading concept.

public class StaticPolymorpshism {

	public void emotions() {
		System.out.println("Happy");
	}
	public void emotions(String es) {
		System.out.println("Sad");
	}
	public void emotions(int a,int b) {
	int res=a/b;
	System.out.println(res);
	}
	
	public void emotions(int b ,String s) {
		System.out.println();
	}
	public void emotions(Object emo) {
		System.out.println(new String());
	}
}
