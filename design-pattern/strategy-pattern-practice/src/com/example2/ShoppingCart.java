package com.example2;

public class ShoppingCart {
	private DiscountStrategy discountStrategy;
	
	
	public ShoppingCart (DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public void setDiscountStrategy(DiscountStrategy strategy) {
		this.discountStrategy = strategy;
	}
	
	public void checkout(double price) {
		double finalPrice = discountStrategy.applyDiscount(price);
		
		System.out.println("Original Price : " + price);
		System.out.println("Final Price : "+ finalPrice);
	}
}
