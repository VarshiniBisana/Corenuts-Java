package com.cnf.nov23;
//Q3.3.Write a program which demonstrates constructor overloading?
public class EmployeeInfo {

	
	int id, YearOfJoining;
	String Name,ContactNO,Address;
	
	public EmployeeInfo( int yearOfJoining, String name, String contactNO) {
		
		this.YearOfJoining = yearOfJoining;
		this.Name = name;
		this.ContactNO = contactNO;	
	}
	
	public EmployeeInfo(int id,String Address) {
		this(2021,"Varshini","9880437543");
		this.id=id;
		this.Address=Address;
	}
	public static void main(String[] args) {
		EmployeeInfo info = new EmployeeInfo(01, "Bangalore");
		System.out.println("Employee deatils:"+" "+"Name:"+info.Name+" "+"Id:"+info.id+" "+"Year of joining:"+info.YearOfJoining+" "+"ContactNo:"+info.ContactNO+" "+"Address:"+info.Address);
	}
}
