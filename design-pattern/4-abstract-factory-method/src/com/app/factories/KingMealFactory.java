package com.app.factories;

import com.app.products.BasicWheatBurger;
import com.app.products.BasicWheatGarlicBread;
import com.app.products.Burger;
import com.app.products.CheeseWheatGarlicBread;
import com.app.products.GarlicBread;
import com.app.products.PremiumWheatBurger;
import com.app.products.StandardWheatBurger;

public class KingMealFactory implements MealFactory{
	
	@Override
	public Burger createBurger(String type) {
		if(type.equals("basic")) {
			return new BasicWheatBurger();
		}else if(type.equals("standard")) {
			return new StandardWheatBurger();
		}else if(type.equals("premium")) {
			return new PremiumWheatBurger();
		}
		return null;
	}

	@Override
	public GarlicBread createGarlicBread(String type) {
		
		if(type.equals("basic")) {
			return new BasicWheatGarlicBread();
		}else if(type.equals("cheese")) {
			return new CheeseWheatGarlicBread();
		}
		return null;
		
	}
}
