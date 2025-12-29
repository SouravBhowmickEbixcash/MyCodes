package com.tomato.app.models;

public class PickupOrder extends Order{
	private String restaurantAddress;
	
	public PickupOrder () {
		this.restaurantAddress = "";
	}

	@Override
	public String getType() {
		return "pickup";
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	

}
