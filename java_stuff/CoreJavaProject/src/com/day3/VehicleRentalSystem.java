package com.day3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vehicle Rental!");
		
		System.out.print("Enter number of vehicles: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.print("Enter type (1-Car, 2-Bike): ");
			int type = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Vehicle Number: ");
			String vehicleNum = sc.nextLine();
			
			System.out.print("Enter Model: ");
			String model = sc.nextLine();
			
			System.out.print("Enter Rate per Day: ");
			double rate = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Enter Days: ");
			int days = sc.nextInt();
			sc.nextLine();
			
			if (type == 1) {
				System.out.print("Enter Insurance per Day: ");
				double insurance = sc.nextDouble();
				sc.nextLine();
				Vehicle temp = new Car(vehicleNum, model, rate, days, insurance);
				vehicles.add(temp);
			}
			else {
				Vehicle temp = new Bike(vehicleNum, model, rate, days);
				vehicles.add(temp);
			}
		}
		
		double totalRent = 0;
		for (Vehicle v : vehicles) totalRent += v.calculateRent();
		
		for (Vehicle v : vehicles) System.out.println(v.displayDetails());
		System.out.println("Total Rent Collected: " + totalRent);
		
		sc.close();
	}
}

class Vehicle {
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

class Car extends Vehicle {
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

class Bike extends Vehicle {
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
