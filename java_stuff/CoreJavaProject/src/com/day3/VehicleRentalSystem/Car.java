package com.day3.VehicleRentalSystem;

public class Car extends Vehicle {
	double insuranceCharge;
	
	public Car(String num, String model, double rate, int numDays, double insurance) {
		super(num, model, rate, numDays);
		this.insuranceCharge = insurance;
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return super.calculateRent() + (insuranceCharge * days);
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return "Car\t| " + super.displayDetails();
	}
	
	
}