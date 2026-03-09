package com.example2;

public class FactoryTest {

	public static void main(String[] args) {
        PaymentCreator processor;
        	
        processor = new CreditCardPaymentCreator();
        processor.checkout(100.00);
        
        processor = new PaypalPaymentCreator();
        processor.checkout(250.00);
        
        processor = new CryptoPaymentCreator();
        processor.checkout(500.00);

	}

}
