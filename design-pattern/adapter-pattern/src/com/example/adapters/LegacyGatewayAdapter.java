package com.example.adapters;

import com.example.inter.PaymentProcessor;
import com.example.third_party.LegacyGateway;

public class LegacyGatewayAdapter implements PaymentProcessor{
	private final LegacyGateway legacyGateway;
	private long currentTrn;
	
	
	public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
		this.legacyGateway = legacyGateway;
	}
	
	@Override
	public void processPayment(double amount, String currency) {
		System.out.println("Adapter : translating processPayment() for " + amount + " " + currency);
		legacyGateway.executeTransaction(amount, currency);
		currentTrn = legacyGateway.getReferenceNumber();
		
	}

	@Override
	public boolean isPaymentSuccessful() {
		return legacyGateway.checkstatus(currentTrn);
	}

	@Override
	public String getTransactionId() {
		return "LEGACY_TXN_" + currentTrn;
	}

}
