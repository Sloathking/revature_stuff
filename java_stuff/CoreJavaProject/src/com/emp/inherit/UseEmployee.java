package com.emp.inherit;

import java.util.Scanner;
import com.emp.Employee;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe1 = new PermanentEmployee("Permanent Employee 1", 10000, 3000);
		System.out.println(pe1);
		System.out.println("Total salary of permanent employee: " + pe1.calculateSalary());
		
		TempEmployee te1 = new TempEmployee("Temp Employee 1", 0.0, 4, 250.0);
		System.out.println(te1);
		
		Employee pe2 = new PermanentEmployee("Permanent Employee 2", 10000, 3000);
		Employee te2 = new TempEmployee("Temp Emplopyee 2", 0.0, 3, 200.0);
		
		pe2.Display();
		te2.Display();
		
		PermanentEmployee pe3 = (PermanentEmployee)pe2;
		PermanentEmployee pe4 = pe1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(id);
		
		System.out.print("Enter the employee name: ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("Enter the employee slary: ");
		double salary = sc.nextDouble();
		System.out.println(salary);
		
		sc.close();
	}

}
