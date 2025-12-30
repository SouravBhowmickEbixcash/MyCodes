package com.app.factory;

import com.app.product.Burger;

public interface BurgerFactory {
	
	Burger createBurger(String type);

}
