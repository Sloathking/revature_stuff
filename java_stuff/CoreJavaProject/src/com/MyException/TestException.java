package com.MyException;

public class TestException {
	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5};
		try {
			System.out.println(numArray[2]);
			System.out.println("try{} block");
			
			int x = 10/1;
			System.out.println(x);
			String name = "Brett";
//			name = null;
			System.out.println(name.length());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I always execute.");
		}
		System.out.println("Program Complete");
	}
}
