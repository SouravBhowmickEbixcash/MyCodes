package com.app.factories;

import com.app.products.BasicBurger;
import com.app.products.BasicGarlicBread;
import com.app.products.Burger;
import com.app.products.CheeseGarlicBread;
import com.app.products.GarlicBread;
import com.app.products.PremiumBurger;
import com.app.products.StandardBurger;

public class SinghMealFactory implements MealFactory{

	@Override
	public Burger createBurger(String type) {
		if(type.equals("basic")) {
			return new BasicBurger();
		}else if(type.equals("standard")) {
			return new StandardBurger();
		}else if(type.equals("premium")) {
			return new PremiumBurger();
		}
		return null;
	}

	@Override
	public GarlicBread createGarlicBread(String type) {
		
		if(type.equals("basic")) {
			return new BasicGarlicBread();
		}else if(type.equals("cheese")) {
			return new CheeseGarlicBread();
		}
		return null;
		
	}

}
