package com.abstractemp;

public class Main {
	
	/*
	 * An abstract class is declared using the abstract keyword.
	 * We cannot create an object of an abstract class directly.
	 * An abstract class can contain both abstract and non-abstract methods.
	 * An abstract method does not have a method body.
	 * An abstract method must be declared using the abstract keyword.
	 * If a class contains at least one abstract method, the class must be declared abstract.
	 * An abstract class can contain constructors.
	 * An abstract class can contain instance variables and static variables.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe = new PermanentEmployee(1, "Test PE1", 10000, 2500);
		System.out.println(pe);
		System.out.println(pe.calcSalary());
		
		Employee e1 = new PermanentEmployee(1, "", 10, 2);
		System.out.println(e1);
		System.out.println(e1.calcSalary());
	}

}
