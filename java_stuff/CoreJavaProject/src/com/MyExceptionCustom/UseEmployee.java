package com.MyExceptionCustom;

public class UseEmployee {
	public static void main(String[] args) {
		try {
			Employee e1 = new Employee(1, "Test", -45000);
			System.out.println(e1);
		}
		catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
}
