package com.example2;

public class CreditCardPaymentCreator extends PaymentCreator{

	@Override
	public PaymentMethod createPayment() {
		return new CreditCardPayment();
	}

}
