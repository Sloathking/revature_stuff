package com.MyInterface;

public class UsePayment {

	public static void main(String[] args) {
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.Pay(1000);
		
		UpiPayment up = new UpiPayment();
		up.Pay(1100);
		
		Payment p1 = new CreditCardPayment();
		p1.Pay(1200);
		
//		System.out.println(p1.minPay);
		System.out.println(Payment.minPay);
		// Variables in interface are by default final, i.e., constant
//		Payment.minPay += 100;
	}

}
