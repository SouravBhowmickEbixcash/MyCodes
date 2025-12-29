package com.tomato.app.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private Restaurant restaurant;
	private List<MenuItem> items = new ArrayList<>();
	
	
	public Cart() {
		restaurant = null;
	}
	
	public void setRestaurant(Restaurant res) {
		this.restaurant = res;
	}
	
	public Restaurant getRestaurant() {
		return this.restaurant;
	}
	
	public void addItem (MenuItem item) {
		if(this.restaurant == null) {
			System.err.println("Cart: Set a restaurant before adding items.");
			return;
		}
		this.items.add(item);
	}
	
	
	public double getTotalCost() {
		double total = 0.0;
		for(MenuItem menu : items) {
			total += menu.getPrice();
		}
		
		return total;
	}
	
	public boolean isEmpty() {
		return this.items == null || this.items.isEmpty();
	}
	
	
	public void clear() {
		this.items.clear();
	}
	
	
	public List<MenuItem> getItems () {
		return this.items;
	}
	
	
}
