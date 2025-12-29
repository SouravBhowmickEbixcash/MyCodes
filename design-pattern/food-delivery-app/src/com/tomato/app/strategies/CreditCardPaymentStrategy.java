package com.tomato.app.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy{
	
	private String cardNumber;
	
	public CreditCardPaymentStrategy (String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card (" + cardNumber + ")");
	}

}
