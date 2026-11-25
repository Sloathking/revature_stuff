package com.cts.repo;

import com.cts.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	private Employee[] employees = new Employee[5];
	
	private int count = 0;
	
	@Override
	public Employee[] findAllEmployees() {
		Employee[] res = new Employee[count];
		for (int i = 0; i < count; i++) {
			res[i] = employees[i];
		}
		return res;
	}

	@Override
	public void saveEmployee(Employee emp) {
		if (count < employees.length) {
			employees[count] = emp;
			count++;
		}
		else {
			System.out.println("Employee array is full!");
		}
	}

	@Override
	public void deleteEmployee(Employee emp) {
		for (int i = 0; i < count; i++)
			if (employees[i] == emp) {
				employees[i] = null;
				System.out.println("Employee removed");
			}
	}

}
