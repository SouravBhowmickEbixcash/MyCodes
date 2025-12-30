package com.app;

import com.app.factory.BurgerFactory;
import com.app.product.Burger;

public class SimpleFactoryPattern {

	public static void main(String[] args) {
		String type = "premium";
		
		BurgerFactory myBurgerFactory = new BurgerFactory();
		
		Burger burger = myBurgerFactory.createBurger(type);
		burger.prepare();

	}

}
