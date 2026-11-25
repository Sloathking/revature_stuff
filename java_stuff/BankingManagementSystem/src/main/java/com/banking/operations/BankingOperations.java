package com.banking.operations;

import java.util.List;
import java.util.Scanner;

import com.banking.BankOperations;
import com.banking.Main;
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
	public void customerDetails(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter Customer ID: ");
		int i = sc.nextInt();
		sc.nextLine();
		Customer temp = Main.getCustomer(i - 1);
		if (temp == null) {
			System.out.println("No customer by that ID.");
			return;
		}
		System.out.println(temp);
		sc.nextLine();
	}

	@Override
	public void depositMoney(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkAccountBalance(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter Customer ID: ");
		int i = sc.nextInt();
		sc.nextLine();
		List<Account> temp = Main.getCustomerAccounts(i);
		if (temp.isEmpty()) {
			System.out.println("No accounts for that ID.");
			return;
		}
		System.out.println(temp);
		sc.nextLine();
	}

	@Override
	public void transferMoney(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewTransactionHistory(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
