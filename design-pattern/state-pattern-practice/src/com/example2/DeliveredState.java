package com.example2;

public class DeliveredState implements OrderState{

	@Override
	public void pay(Order order) {
		System.out.println("Order already delivered !!");
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Order already delivered !!");
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Order delivered !!");
		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order already delivered !!");
		
	}

}
