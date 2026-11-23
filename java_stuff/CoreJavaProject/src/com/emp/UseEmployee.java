package com.emp;

public class UseEmployee {
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		Employee empObj = new Employee("Alice", 10000);
		System.out.println(empObj.id);
		System.out.println(empObj.getName());
		System.out.println(empObj.getSalary());
		
		Employee empObj1 = new Employee("Bob", 10000);
		
		Employee empObj2 = new Employee("Mark", 10000);
		
		System.out.println(empObj.toString());
        System.out.println(empObj1.toString());
        System.out.println(empObj2.toString());
        
        empObj.incrementSalary();
        System.out.println(empObj.toString());
        
        empObj.setSalary(15000);
        System.out.println(empObj.toString());
        
        Employee emp1 = new Employee(1,"Steve", 12000);
        Employee emp2 = new Employee(1, "Steve", 12000);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
        
        System.gc();
	}

}
