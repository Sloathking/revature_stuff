package com.cts;

import com.cts.model.Employee;
import com.cts.repo.EmployeeRepo;
import com.cts.repo.EmployeeRepoImpl;
import com.cts.service.EmployeeService;

public class UseEmployee {

	public static void main(String[] args) {
		EmployeeRepo empRepo = new EmployeeRepoImpl();
		EmployeeService empServ = new EmployeeService(empRepo);
		
		Employee e1 = new Employee(1l, "Dio Brando", "Trainee", 1000.0);
		Employee e2 = new Employee(2l, "Lisa Lisa", "Supervisor", 10000.0);
		
		empServ.saveEmployee(e1);
		empServ.saveEmployee(e2);
		
		for (Employee e : empServ.getAllEmployees()) {
			System.out.println(e);
		}
	}

}
