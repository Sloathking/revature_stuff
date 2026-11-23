package com.emp.inherit;

import com.emp.Employee;

public class PermanentEmployee extends Employee {
	private double bonus;

	public PermanentEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	public PermanentEmployee(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return salary + bonus;
	}

	@Override
	public String Display() {
		// TODO Auto-generated method stub
		String temp = super.Display();
		return temp + " Bonus: " + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.bonus;
	}
	
}
