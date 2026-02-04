package com.example.impl;

import com.example.inter.PaymentProcessor;

public class InHousePaymentProcessor implements PaymentProcessor{
	
	private String transactionId;
	private boolean isPaymentSuccessful;
	
	@Override
	public void processPayment(double amount, String currency) {
		System.out.println("InHousePaymentProcessor : Processing Payment of " + amount + " " + currency);
		transactionId = "TXN_" + System.currentTimeMillis();
		isPaymentSuccessful = true;
		System.out.println("InHousePaymentProcessor : Payment successfull. Txn Id : " + transactionId);
	}

	@Override
	public boolean isPaymentSuccessful() {
		return isPaymentSuccessful;
	}

	@Override
	public String getTransactionId() {
		return "TXN_" + transactionId;
	}
	

}
