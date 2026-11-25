package com.banking;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import com.banking.operations.BankingOperations;
import com.banking.model.*;

public class Main {

	public static void main(String[] args) {
		// Application entry point; displays the menu and controls the console workflow
		
		boolean running = true;
		
		BankOperations bank = new BankingOperations();
		
		List<Customer> customers = new ArrayList<>(Arrays.asList(
				new Customer("Jonathan Joestar", "jonathan.joestar@email.com", "123-456-7890"),
				new Customer("Dio Brando", "dio.brando@email.com", "123-456-7890"),
				new Customer("Robert Speedwagon", "robert.speedwagon@email.com", "123-456-7890"),
				new Customer("Lisa Lisa", "lisa2@email.com", "123-456-7890"),
				new Customer("Joseph Joestar", "joseph.joestar@email.com", "123-456-7890")
				));
		List<Account> accounts = new ArrayList<>(Arrays.asList(
				new Account(1, "Checking", 150),
				new Account(1, "Savings", 3000),
				new Account(2, "Checking", 10000),
				new Account(2, "Savings", 1),
				new Account(3, "Checking", 2300)
				));
		
		Scanner sc = new Scanner(System.in);
		
		while (running) {
			printMenu();
			try {
				int choice = sc.nextInt();
				sc.nextLine();
			
				switch (choice) {
				case 1:	// Create Customer
					customers.add(bank.createCustomer(sc));
					break;
				case 2:	// Create bank account
					accounts.add(bank.createAccount(sc));
					break;
				case 3:	// View customer details
					System.out.print("Enter Customer ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					for (Customer c : customers)
						if (c.getId() == id)
							bank.customerDetails(sc, c);
					break;
				case 4:	// Deposit money
					bank.depositMoney(sc);
					break;
				case 5:	// Withdraw money
					bank.withdrawMoney(sc);
					break;
				case 6:	// Check account balance
					bank.checkAccountBalance(sc);
					break;
				case 7:	// Transfer money
					bank.transferMoney(sc);
					break;
				case 8:	// View transaction history
					bank.viewTransactionHistory(sc);
					break;
				case 9:	// Exit
					running = false;
					System.out.println("Exiting Management System");
					break;
				default: System.out.println("Invalid option!");
					break;
				}
			}
			catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Only enter a valid number choice!");
			}
		}
		sc.close();
	}
	
	public static void printMenu() {
		System.out.println("=====================================");
		System.out.println("      BANKING MANAGEMENT SYSTEM      ");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("1. Create Customer");
		System.out.println("2. Create Bank Account");
		System.out.println("3. View Customer Details");
		System.out.println("4. Deposit Money");
		System.out.println("5. Withdraw Money");
		System.out.println("6. Check Account Balance");
		System.out.println("7. Transfer Money");
		System.out.println("8. View Transaction History");
		System.out.println("9. Exit");
		System.out.print("Enter your choice: ");
	}
}
