package com.banking.model;

public class Customer {
	private static int customerNumber = 0;
	
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	
	public Customer(String name, String email, String phoneNumber) {
		this.id = ++customerNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("Customer Created! Account Number: " + this.id + " | Name: " + this.name + " | Email: " + this.email + " | Phone Number: " + this.phoneNumber);
	}

	// getters / setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	@Override
	public String toString() {
		return "Customer id: " + id + ", name: " + name + ", email: " + email + ", phoneNumber: " + phoneNumber;
	}
	
}
