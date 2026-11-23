package com.emp;

import java.util.Objects;

public class Employee {
	static int num = 100;
	
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		this.id = num++;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name, Double.valueOf(salary));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	double incrementSalary() {
		return salary += salary * 0.03;
	}
	
	// to fetch name property outside the class
	public String getName() {
		return name;
	}
	
	// to update name property outside the class
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

//	@SuppressWarnings("removal")
//	@Override
//	protected void finalize() throws Throwable {
//		System.out.println("Employee" + id + "is being GC'd!");
//		super.finalize();
//	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public String Display() {
		return this.id + " " + this.name + " " + this.salary;
	}
}
