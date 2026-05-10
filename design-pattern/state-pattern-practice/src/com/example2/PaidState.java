package com.example2;

public class PaidState implements OrderState{

	@Override
	public void pay(Order order) {
		System.out.println("Order [" + order.getOrderId() + "] already paid!!");
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Order [" + order.getOrderId() + "] shipped.");
		order.setState(new DeliveredState());
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Cannot deliver. Order not shipped yet!!");
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order [" + order.getOrderId() + "] cancelled. Refund issued!!");
		order.setState(new CancelledState());
		
	}

}
