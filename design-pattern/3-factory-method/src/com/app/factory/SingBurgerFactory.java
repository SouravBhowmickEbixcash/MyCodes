package com.app.factory;

import com.app.product.BasicBurger;
import com.app.product.Burger;
import com.app.product.PremiumBurger;
import com.app.product.StandardBurger;

public class SingBurgerFactory implements BurgerFactory{

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

}
