package com.tomato.app.managers;

import java.util.ArrayList;
import java.util.List;

import com.tomato.app.models.Order;

public class OrderManager {
	private List<Order> orders;
	private static OrderManager instance = null;
	
	private OrderManager () {
		// private constructor
		this.orders = new ArrayList<>();
	}
	
	
	public static OrderManager getInstance() {
		if(instance == null) {
			synchronized (OrderManager.class) {
				if(instance == null) {
					instance = new OrderManager();
				}
			}
		}
		
		return instance;
	}
	
	
	public void addOrder (Order order) {
		this.orders.add(order);
	}
	
	public void listOrders() {
		System.out.println("\n------ All Orders ------");
		for(Order order : orders ) {
			System.out.println(order.getType() + " oder for " + order.getUser().getName() + " | Total : " + order.getTotal() + " | Scheduled at : " + order.getSchedule());
		}
	}

}
