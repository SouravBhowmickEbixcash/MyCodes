package com.app;

import com.app.factories.KingMealFactory;
import com.app.factories.MealFactory;
import com.app.products.Burger;
import com.app.products.GarlicBread;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		String burgerType = "standard";
		String garlicBreadType = "cheese";
		
		MealFactory factory = new KingMealFactory();
		Burger burger = factory.createBurger(burgerType);
		GarlicBread garlicBread = factory.createGarlicBread(garlicBreadType);
		
		burger.prepare();
		garlicBread.prepare();

	}

}
