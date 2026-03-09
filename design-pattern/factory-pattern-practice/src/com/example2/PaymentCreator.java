package com.example2;

public abstract class PaymentCreator {
	
	public abstract PaymentMethod createPayment();
	
	public void checkout(double amount) {
		PaymentMethod payment = createPayment();
		payment.validatePayment();
		payment.processPayment(amount);
		System.out.println(payment.getReceipt());
	}

}
