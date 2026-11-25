package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.model.Employee;
import com.cts.repo.EmployeeRepo;
import com.cts.service.EmployeeService;

public class EmployeeServiceTest {

	// creates mock obj of EmployeeRepo
	@Mock
	private EmployeeRepo empRepo;
	
	// inject mock EmployeeRepo into EmpService
	@InjectMocks
	private EmployeeService empServ;
	
	@BeforeEach
	public void setup() {
		// openMocks - id's and init's Mockito annotations in the current test class
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testFindAllEmployees() {
		Employee e1 = new Employee(1L, "Dio Brando", "Trainee", 1000);
		Employee e2 = new Employee(2L, "Lisa Lisa", "Supervisor", 10000);
		
		Employee[] emps = {e1, e2};
		
		when(empRepo.findAllEmployees()).thenReturn(emps);
		
		Employee[] empServArray = empServ.getAllEmployees();
		
		assertNotNull(empServArray);
		assertEquals(emps.length, empServArray.length);
		assertEquals(e1, empServArray[0]);
		assertEquals(e2, empServArray[1]);
		assertEquals("Dio Brando", empServArray[0].getName());
		assertEquals("Lisa Lisa", empServArray[1].getName());
//		assertTrue(emps == empServArray);
	}
	
	@Test
	public void testSaveEmployees() {
		Employee e1 = new Employee(1L, "Dio Brando", "Trainee", 1000);
		empServ.saveEmployee(e1);
		verify(empRepo, times(1)).saveEmployee(e1);
	}
	
	@Test
	public void testDeleteEmployee() {
		Employee e1 = new Employee(1L, "Dio Brando", "Trainee", 1000);
		empServ.saveEmployee(e1);
		
		empServ.deleteEmployee(e1);
		verify(empRepo, times(1)).deleteEmployee(e1);
	}
}
