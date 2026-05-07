package com.example2;

public interface OrderState {
	void pay(Order order);
	void ship(Order order);
	void deliver(Order order);
	void cancel(Order order);
}
