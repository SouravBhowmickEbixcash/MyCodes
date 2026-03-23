package com.example2;

public class PercentageDiscount implements DiscountStrategy{
	private double percentage;
	
	public PercentageDiscount (double percentage) {
		this.percentage = percentage;
	}
	@Override
	public double applyDiscount(double price) {
		System.out.println("Percentage Discount on price " + price);
		return price - ((percentage/100)*price);
	}

}
