package com.example2;

public class ShippedState implements OrderState{

	@Override
	public void pay(Order order) {
		System.out.println("Order already paid !!");
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Order already shipped !!");
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Order [" + order.getOrderId() + "] delivered !!");
		order.setState(new DeliveredState());
		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Cannot cancel. Order already shipped !!");
		
	}

}
