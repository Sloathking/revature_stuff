package com.banking;

import java.util.Scanner;

import com.banking.model.*;

public interface BankOperations {
	public Customer createCustomer(Scanner sc);
	public Account createAccount(Scanner sc);
	public void customerDetails(int custId);
}
