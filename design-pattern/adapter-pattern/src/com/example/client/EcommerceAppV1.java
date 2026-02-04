package com.example.client;

import com.example.adapters.LegacyGatewayAdapter;
import com.example.impl.InHousePaymentProcessor;
import com.example.inter.PaymentProcessor;
import com.example.service.CheckoutService;
import com.example.third_party.LegacyGateway;

public class EcommerceAppV1 {

	public static void main(String[] args) {
		
		System.out.println("-----Using Modern Processor-----");
		PaymentProcessor processor = new InHousePaymentProcessor();
		CheckoutService checkoutService = new CheckoutService(processor);
		checkoutService.checkout(199.99, "INR");
		
		
		System.out.println("-------Using Legacy Gateway via Adaptor-----");
		LegacyGateway legacyGateway = new LegacyGateway();
		PaymentProcessor processor2 = new LegacyGatewayAdapter(legacyGateway);
		CheckoutService legacyCheckout = new CheckoutService(processor2);
		legacyCheckout.checkout(75.50, "USD");
		

	}

}
