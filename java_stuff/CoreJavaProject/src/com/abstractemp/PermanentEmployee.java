package com.abstractemp;

public class PermanentEmployee extends Employee {
	
	private double bonus;

	public PermanentEmployee(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	@Override
	double calcSalary() {
		// TODO Auto-generated method stub
		return salary + bonus;
	}

	// getters / setters
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
