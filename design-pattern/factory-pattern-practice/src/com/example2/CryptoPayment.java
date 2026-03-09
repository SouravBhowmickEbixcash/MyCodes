package com.example2;

public class CryptoPayment implements PaymentMethod{

	@Override
	public boolean validatePayment() {
		System.out.println("Validating crypto wallet...");
		return true;
	}

	@Override
	public void processPayment(double amount) {
		double fee = 0.005*amount;
		System.out.printf("Processing Crypto payment payment: $%.2f (fee: $%.2f)%n", amount, fee);
		
	}

	@Override
	public String getReceipt() {
		return "Wallet: 0x1a2b...3c4d";
	}

}
