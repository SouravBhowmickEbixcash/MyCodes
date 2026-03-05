package com.example2;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public boolean validatePayment() {
		System.out.println("Validating Credit Card...");
		return true;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getReceipt() {
		// TODO Auto-generated method stub
		return null;
	}

}
