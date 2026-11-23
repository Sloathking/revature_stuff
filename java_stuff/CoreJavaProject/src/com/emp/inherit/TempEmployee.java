package com.emp.inherit;

import com.emp.Employee;

public class TempEmployee extends Employee {
	private int workingDays;
	private double perDayRate;
	
	public TempEmployee(String name, double salary, int workingDays, double perDayRate) {
		super(name, salary);
		this.workingDays = workingDays;
		this.perDayRate = perDayRate;
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return workingDays + perDayRate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + workingDays + " " + perDayRate;
	}

	@Override
	public String Display() {
		// TODO Auto-generated method stub
		return super.Display() + "Days per week: " + workingDays + " Per day rate: " + perDayRate;
	}

	// getters / setters
	public int getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	public double getPerDayRate() {
		return perDayRate;
	}
	public void setPerDayRate(double perDayRate) {
		this.perDayRate = perDayRate;
	}
	
}
