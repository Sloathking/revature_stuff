package com.banking;

import java.util.Scanner;

import com.banking.model.*;

public interface BankOperations {
	public Customer createCustomer(Scanner sc);
	public Account createAccount(Scanner sc);
	public void customerDetails(Scanner sc);
	public void depositMoney(Scanner sc);
	public void withdrawMoney(Scanner sc);
	public void checkAccountBalance(Scanner sc);
	public void transferMoney(Scanner sc);
	public void viewTransactionHistory(Scanner sc);
}
