package com.example.third_party;

public class LegacyGateway {
	
	private Long transactionReference;
	private boolean isPaymentSuccessful;
	
	public void executeTransaction(double totalAmount, String currency) {
		System.out.println("LegacyGateway : executing transaction : " + totalAmount + " " + currency);
		transactionReference = System.nanoTime();
		isPaymentSuccessful = true;
		System.out.println("LegacyGateway : Transaction executed successfully. Txn Id: " + transactionReference);
	}
	
	public boolean checkstatus(long transactionReference) {
		System.out.println("LegacyGateway : Checking status for Ref id : " + transactionReference);
		return isPaymentSuccessful;
	}
	
	public long getReferenceNumber() {
		return transactionReference;
	}
	
}
