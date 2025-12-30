package com.app.factories;

import com.app.products.Burger;
import com.app.products.GarlicBread;

public interface MealFactory {
	
	Burger createBurger(String type);
	GarlicBread createGarlicBread(String type);

}
