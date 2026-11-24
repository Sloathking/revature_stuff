package com.MyInterface;

public class CreditCardPayment implements Payment {

	@Override
	public void Pay(double amount) {
		System.out.println("You have made the payment via credit card of amount " + amount);
	}

	@Override
	public void Show() {
		System.out.println("Show() called");
	}

}
