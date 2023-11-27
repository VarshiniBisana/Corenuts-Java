package com.Assign.Nov8;

public class SumOfArrayWOL {
public static void main(String[] args) {
	SumOfArrayWOL num = new SumOfArrayWOL();
//	num.sum();
	num.sumofN(null, 0, 0);
	int[]value1= {2,4,6,8};
//	int sum=0;
//	int index=0;
	
}
//
//public void sum() {
//	int values[]= new int[3];
//	values[0]=9;
//	values[1]=4;
//	values[2]=6;
//	int sum= values[0]+values[1]+values[2];
//	System.out.println(sum);
//	
//}
public int sumofN(int[]a,int sum,int index) {
	sum = sum+a[index];
	index++;
	if(index==a.length) {
		return sum;
	}
	return sumofN(a,sum,index);
	
}



}
