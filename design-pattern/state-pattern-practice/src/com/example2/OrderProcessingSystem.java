package com.example2;

public class OrderProcessingSystem {

	public static void main(String[] args) {
		Order order1 = new Order("OQJNC-742874");
		order1.pay();
		order1.ship();
		order1.deliver();
		order1.cancel();
		
		System.out.println();
		Order order2 = new Order("AKJSDH-182913");
		order2.pay();
		order2.cancel();
		
		System.out.println();
		Order order3 = new Order("JASNDK-128730");
		order3.pay();
		order3.ship();
		order3.cancel();

	}

}
