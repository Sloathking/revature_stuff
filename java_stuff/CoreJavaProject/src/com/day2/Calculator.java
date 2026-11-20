package com.day2;

public class Calculator {

	public static int addition(int lhs, int rhs) {
		return lhs + rhs;
	}
	
	public static int subtraction(int lhs, int rhs) {
		return lhs - rhs;
	}
	
	public static int multiplication(int lhs, int rhs) {
		return lhs * rhs;
	}
	
	public static int division(int lhs, int rhs) {
		if (rhs == 0) {
			System.out.println("Division by Zero");
			return 0;
		}
		return lhs / rhs;
	}
	
	public static float addition(float lhs, float rhs) {
		return lhs + rhs;
	}
	
	public static void main(String[] args) {
		System.out.println(addition(1, 2));
		System.out.println(addition(1.f, 2.f));
	}

}
