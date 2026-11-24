package com.banking.operations;

import java.util.Scanner;

import com.banking.BankOperations;
import com.banking.model.*;

// Declares banking operations that the application supports
public class BankingOperations implements BankOperations {

	@Override
	public Customer createCustomer(Scanner sc) {
		System.out.println("Creating new customer...");
		
		System.out.print("Enter customer name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter customer email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter customer phone number: ");
		String phoneNumber = sc.nextLine();
		
		return new Customer(name, email, phoneNumber);
		
	}

	@Override
	public Account createAccount(Scanner sc) {
		System.out.println("Creating new account...");
		
		System.out.print("Enter customer ID: ");
		int custId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account type: ");
		String accType = sc.nextLine();
		
		System.out.print("Enter account balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		
		return new Account(custId, accType, balance);
	}

	@Override
	public void customerDetails(int custId) {
		// TODO Auto-generated method stub
		System.out.println("Customer Details...");
	}
	
}
