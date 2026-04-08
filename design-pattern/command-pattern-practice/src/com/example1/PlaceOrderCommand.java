package com.example1;

public class PlaceOrderCommand implements OrderCommand{
	private Kitchen kitchen;
	private String dish;
	
	public PlaceOrderCommand (Kitchen kitchen, String dish) {
		this.kitchen = kitchen;
		this.dish = dish;
	}
	@Override
	public void execute() {
		this.kitchen.prepareDish(dish);
	}

	@Override
	public void undo() {
		this.kitchen.cancelDish(dish);
		
	}

}
