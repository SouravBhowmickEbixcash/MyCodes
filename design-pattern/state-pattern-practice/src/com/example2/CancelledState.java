package com.example2;

public class CancelledState implements OrderState{

	@Override
	public void pay(Order order) {
		System.out.println("Order is cancelled !!");
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Order is cancelled !!");
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Order is cancelled !!");
		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order is cancelled !!");
		
	}

}
