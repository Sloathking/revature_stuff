package com.banking;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

import com.banking.operations.BankingOperations;
import com.banking.model.*;

public class Main {

	public static void main(String[] args) {
		// Application entry point; displays the menu and controls the console workflow
		
		boolean running = true;
		
		BankOperations bank = new BankingOperations();
		
		List<Customer> customers = new ArrayList<>();
		List<Account> accounts = new ArrayList<>();
		
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
					break;
				case 4:	// Deposit money
					break;
				case 5:	// Withdraw money
					break;
				case 6:	// Check account balance
					break;
				case 7:	// Transfer money
					break;
				case 8:	// View transaction history
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
