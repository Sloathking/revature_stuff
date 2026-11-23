package com.day3.VehicleRentalSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
	public static void main(String[] args) {
		// Polymorphism used to allow storage of both Car and Bike in the same container
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
				// declared as Vehicle to use polymorphism to store a Car as a vehicle
				Vehicle temp = new Car(vehicleNum, model, rate, days, insurance);
				vehicles.add(temp);
			}
			else {
				// declared as Vehicle to use polymorphism to store a Bike as a vehicle
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