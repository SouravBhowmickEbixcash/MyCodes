package com.example2;

public class DiscountCalculatorDemo {

	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new NoDiscount());
        cart.checkout(100.00);

        cart.setDiscountStrategy(new PercentageDiscount(20));
        cart.checkout(100.00);

        cart.setDiscountStrategy(new FlatDiscount(15.00));
        cart.checkout(100.00);

	}

}
