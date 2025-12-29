package com.tomato.app.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private static int nextRestaurantId = 0;
	private int restaurantId;
	private String name;
	private String location;
	private List<MenuItem> menu = new ArrayList<>();
	
	
	public Restaurant(String name, String location) {
		this.name = name;
		this.location = location;
		this.restaurantId = ++nextRestaurantId;
	}


	public static int getNextRestaurantId() {
		return nextRestaurantId;
	}


	public static void setNextRestaurantId(int nextRestaurantId) {
		Restaurant.nextRestaurantId = nextRestaurantId;
	}


	public int getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public List<MenuItem> getMenu(){
		return this.menu;
	}
	
	public void addMenu(MenuItem newMenu) {
		this.menu.add(newMenu);
	}


	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location + ", menu="
				+ menu + "]";
	}
	
	

}
