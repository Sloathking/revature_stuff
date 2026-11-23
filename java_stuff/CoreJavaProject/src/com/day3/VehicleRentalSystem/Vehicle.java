package com.day3.VehicleRentalSystem;

public class Vehicle {
	protected String vehicleNumber;
	protected String model;
	protected double ratePerDay;
	protected int days;
	
	public Vehicle(String num, String model, double rate, int numDays) {
		this.vehicleNumber = num;
		this.model = model;
		this.ratePerDay = rate;
		this.days = numDays;
	}
	
	public double calculateRent() {
		return ratePerDay * days;
	}
	
	public String displayDetails() {
		return String.format("%-10s | %-10s | Days: %3d | Rent: %-10s ", this.vehicleNumber, this.model, this.days, this.calculateRent());
	}
}