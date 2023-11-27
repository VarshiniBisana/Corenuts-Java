package com.cnf.nov20;


public class NestedTry {
public static void main(String[] args) throws Exception {
	NestedTry tryref = new NestedTry();
try {
	tryref.Method1();	

} catch (Exception e) {
	System.out.println("Exception:"+e.getMessage());
}
}

private void Method1() throws Exception {
		try {
			try {
				int arr[]= new int[4];
				System.out.println("array:"+arr[10]);
			} 
			catch (IndexOutOfBoundsException e) {
				System.out.println("Exception:"+e.getMessage());
			}
//			System.out.println(res);
			int res=45/0;

		} catch (ArithmeticException e) {
			throw new Exception("No divided by 0");
		}
		
}
}
