package com.day3.VehicleRentalSystem;

// inheriting from Vehicle, polymorphism used to override parent class methods
public class Bike extends Vehicle {
	double discount = 0.10;
	
	public Bike(String num, String model, double rate, int numDays) {
		super(num, model, rate, numDays);
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		double rent = super.calculateRent();
		rent -= rent * discount;
		return rent;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return "Bike\t| " + super.displayDetails();
	}
	
}
