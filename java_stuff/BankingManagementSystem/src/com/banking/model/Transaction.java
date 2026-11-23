package com.banking.model;

import java.time.Instant;

public class Transaction {
	static private int transactionNum = 0;
	private int transactionId;
	private int accountNumber;
	private String transactionType;
	private double amount;
	private String transactionRef;
	private Instant transactionDate;
	
	public Transaction(int accNum, String transType, double amt, String transRef) {
		this.transactionId = ++transactionNum;
		this.accountNumber = accNum;
		this.transactionType = transType;
		this.amount = amt;
		this.transactionRef = transRef;
		this.transactionDate = Instant.now();
	}

	// getters / setters
	public static int getTransactionNum() {
		return transactionNum;
	}

	public static void setTransactionNum(int transactionNum) {
		Transaction.transactionNum = transactionNum;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public Instant getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Instant transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
