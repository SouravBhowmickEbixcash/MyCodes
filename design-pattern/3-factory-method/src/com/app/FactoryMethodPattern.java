package com.app;

import com.app.factory.BurgerFactory;
import com.app.factory.KingBurgerFactory;
import com.app.factory.SingBurgerFactory;
import com.app.product.Burger;

public class FactoryMethodPattern {

	public static void main(String[] args) {
		String type = "premium";
		
		BurgerFactory factory1 = new KingBurgerFactory();
		Burger burger1 = factory1.createBurger(type);
		burger1.prepare();
		
		System.out.println("____________________________________________________________");
		
		BurgerFactory factory2 = new SingBurgerFactory();
		Burger burger2 = factory2.createBurger(type);
		burger2.prepare();

	}

}
