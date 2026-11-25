package com.cts.service;

import com.cts.model.Employee;
import com.cts.repo.EmployeeRepo;

public class EmployeeService {
	private final EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public Employee[] getAllEmployees() {
		return empRepo.findAllEmployees();
	}
	
	public void saveEmployee(Employee emp) {
		empRepo.saveEmployee(emp);
	}
	
	public void deleteEmployee(Employee emp) {
		empRepo.deleteEmployee(emp);
	}
	
}
