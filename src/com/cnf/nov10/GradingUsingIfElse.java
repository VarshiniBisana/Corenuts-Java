package com.cnf.nov10;

public class GradingUsingIfElse {
	public static void main(String[] args) {
		GradingUsingIfElse grade= new GradingUsingIfElse();
		grade.gradingUsingIfElse();
		grade.gradingUsingSwitch();
}
	public void gradingUsingIfElse() {
		int marks=92;
		if(marks>100) {
			System.out.println("enter below 100");
		}
		
		else if (marks<=100 && marks>=80) {
			System.out.println("Firstclass");
		}
		else if(marks<=100 && marks>=50) {
			System.out.println("Secoundclass");
		}
		else if(marks<=100 && marks>=30) {
			System.out.println("thirdclass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	public void gradingUsingSwitch() {
		int totalMarks=56;
		char grade;
		switch (totalMarks / 10) {
		case 10:
		case 9:
			grade = 'A';
			System.out.println("Firstclass");
			break;

		case 8:
		case 7:
			grade = 'B';
			System.out.println("Secoundclass");
			break;
		case 6:
		case 5:
			grade = 'C';
			System.out.println("Thirdclass");
			break;
		case 4:
			grade = 'D';
			System.out.println("Fourthclass");
			break;
		default:
			grade = 'F';
			System.out.println("Fail");
		}
		
		}
	}
