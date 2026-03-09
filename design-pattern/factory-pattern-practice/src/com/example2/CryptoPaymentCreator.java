package com.example2;

public class CryptoPaymentCreator extends PaymentCreator{

	@Override
	public PaymentMethod createPayment() {
		return new CryptoPayment();
	}

}
