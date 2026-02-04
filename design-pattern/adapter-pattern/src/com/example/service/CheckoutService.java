package com.example.service;

import com.example.inter.PaymentProcessor;

public class CheckoutService {
	private PaymentProcessor paymentProcessor;
	
	public CheckoutService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	public void checkout(double amount, String currency) {
		System.out.println("CheckoutService : Attempting to process order for " + amount + " " + currency);
		paymentProcessor.processPayment(amount, currency);
		if(paymentProcessor.isPaymentSuccessful()) {
			System.out.println("CheckoutService : Order Successful ! Trasaction Id : " + paymentProcessor.getTransactionId());
		}else{
			System.out.println("CheckoutService : Order failed. Payment was not successful!");
		}
	}
}
