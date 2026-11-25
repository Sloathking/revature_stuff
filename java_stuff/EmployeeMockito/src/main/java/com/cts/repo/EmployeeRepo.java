package com.cts.repo;

import com.cts.model.*;

public interface EmployeeRepo {
	
	Employee[] findAllEmployees();
	
	void saveEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
}
