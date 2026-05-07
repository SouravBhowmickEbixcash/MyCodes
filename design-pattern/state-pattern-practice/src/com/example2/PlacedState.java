package com.example2;

public class PlacedState implements OrderState{

	@Override
	public void pay(Order order) {
		System.out.println("Order ID - " + order.getOrderId() + " paid!!");
		order.setState(new PaidState());
	}

	@Override
	public void ship(Order order) {
		System.out.println("Cannot Ship : order not paid yet!!");
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Cannot deliver : order not shipped yet!!");
		
	}

	@Override
	public void cancel(Order order) {
		// TODO Auto-generated method stub
		
	}

}
