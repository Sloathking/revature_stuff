package com.MyException;

public class UseException {
	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5};
		try {
			System.out.println(numArray[2]);
			System.out.println("try{} block");
			
			int x = 10/0;
			System.out.println(x);
			String name = "Brett";
//			name = null;
			System.out.println(name.length());
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I always execute.");
		}
		System.out.println("Program Complete");
	}
}
