package com.MyException;

public class AgeValidation {
	public static void main(String[] args) {
		try {
			checkAge(21);
			checkAge(15);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkAge(int age) throws IllegalArgumentException {
		if (age < 16) {
			throw new IllegalArgumentException("Underage Person cannot be processed");
		}
		else {
			System.out.println("Valid age!");
		}
	}
}
