package com.example2;

import java.util.UUID;

public class Order {
	private String orderId;
	private OrderState state;
	
	
	public Order() {
		this.orderId = UUID.randomUUID().toString();
		this.state = new PlacedState();
	}
	
	public void setState(OrderState state) {
		this.state = state;
	}
	
	public String getOrderId() {
		return this.orderId;
	}
}
