package com.example2;

public class Order {
	private String orderId;
	private OrderState state;
	
	
	public Order(String orderId) {
		this.orderId = orderId;
		this.state = new PlacedState();
	}
	
	public void setState(OrderState state) {
		this.state = state;
	}
	
	public String getOrderId() {
		return this.orderId;
	}
	
	public void pay() {
		this.state.pay(this);
	}
	
	public void ship() {
		this.state.ship(this);
	}
	
	public void deliver() {
		this.state.deliver(this);
	}
	
	public void cancel() {
		this.state.cancel(this);
	}
}
