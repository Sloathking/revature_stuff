package com.banking.model;

import java.time.Instant;

public class Account {
	private static int accountNumber = 0;
	private int accId;
	private int customerId;
	private String accountType;
	private double balance;
	Instant createdDate;
	
	public Account(int custId, String accType, double bal) {
		this.accId = ++accountNumber;
		this.customerId = custId;
		this.accountType = accType;
		this.balance = bal;
		this.createdDate = Instant.now();
	}

	// getters / setters
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
