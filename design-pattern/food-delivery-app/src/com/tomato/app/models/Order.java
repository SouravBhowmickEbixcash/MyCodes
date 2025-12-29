package com.tomato.app.models;

import java.util.List;

import com.tomato.app.strategies.PaymentStrategy;

public abstract class Order {
	private static int nextOrderId = 0;
	
	private int orderId; 
	private User user;
	private Restaurant restaurant;
	private List<MenuItem> items;
	private PaymentStrategy paymentStrategy;
	private double total;
	private String schedule;
	
	
	public Order() {
		this.orderId = ++nextOrderId;
		this.restaurant = null;
		this.paymentStrategy = null;
		this.user = null;
		this.total = 0.0;
		this.schedule = "";
	}
	
	
	public boolean processPayment () {
		if(paymentStrategy == null) {
			System.out.println("Please select a payment Strategy!!");
			return false;
		}
		
		paymentStrategy.pay(total);
		return true;
	}

	public abstract String getType();
	
	public int getOrderId() {
		return this.orderId;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public List<MenuItem> getItems() {
		return items;
	}


	public void setItems(List<MenuItem> items) {
		this.items = items;
		this.total = 0;
		for(MenuItem item : items) {
			total += item.getPrice();
		}
	}


	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getSchedule() {
		return schedule;
	}


	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
}
