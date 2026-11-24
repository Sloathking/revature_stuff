package com.MyInterface;

public class UpiPayment implements Payment {

	@Override
	public void Pay(double amount) {
		System.out.println("You have made a payment via UPI of " + amount);
	}

	@Override
	public void Show() {
		System.out.println("Show() called");
	}

}
