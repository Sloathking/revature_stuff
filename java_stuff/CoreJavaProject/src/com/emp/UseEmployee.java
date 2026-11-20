package com.emp;

public class UseEmployee {

	public static void main(String[] args) {
		Employee empObj = new Employee(1, "Alice", 10000);
		System.out.println(empObj.id);
		System.out.println(empObj.name);
		System.out.println(empObj.salary);
		
		Employee empObj1 = new Employee(2, "Bob", 10000);
		System.out.println(empObj1.id);
		System.out.println(empObj1.name);
		System.out.println(empObj1.salary);
		
		System.out.println(empObj.toString());
        System.out.println(empObj1.toString());
	}

}
