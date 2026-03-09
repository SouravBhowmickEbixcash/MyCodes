package com.example2;

public class PaypalPaymentCreator extends PaymentCreator{

	@Override
	public PaymentMethod createPayment() {
		return new PayPalPayment();
	}

}
