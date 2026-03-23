package com.example2;

public class NoDiscount implements DiscountStrategy{

	@Override
	public double applyDiscount(double price) {
		System.out.println("No discount on price " + price);
		return price;
	}

}
