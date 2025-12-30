package com.app.factory;

import com.app.product.BasicWheatBurger;
import com.app.product.Burger;
import com.app.product.PremiumWheatBurger;
import com.app.product.StandardWheatBurger;

public class KingBurgerFactory implements BurgerFactory{

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

}
