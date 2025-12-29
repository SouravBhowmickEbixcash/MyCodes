package com.tomato.app.models;

public class DeliveryOrder extends Order{
	
	private String userAddress;
	
	public DeliveryOrder () {
		this.userAddress = "";
	}
	
	@Override
	public String getType() {
		return "delivery";
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	

}
