package com.example2;

public class PayPalPayment implements PaymentMethod{

	@Override
	public boolean validatePayment() {
		System.out.println("Validating Credit Card...");
		return true;
	}

	@Override
	public void processPayment(double amount) {
		double fee = 0.015*amount;
		System.out.printf("Processing paypal payment: $%.2f (fee: $%.2f)%n", amount, fee);
	}

	@Override
	public String getReceipt() {
		return "PayPal: user@email.com";
	}

}
