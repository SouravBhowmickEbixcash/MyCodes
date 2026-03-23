package com.example2;

public class FlatDiscount implements DiscountStrategy{

	private double flatDiscountPrice;
	
	public FlatDiscount (double flatDiscountPrice) {
		this.flatDiscountPrice = flatDiscountPrice;
	}
	
	@Override
	public double applyDiscount(double price) {
		System.out.println("Flat discount on price " + price);
		return price-flatDiscountPrice;
	}

}
