package com.example1;

public class CancelOrderCommand implements OrderCommand{
	private Kitchen kitchen;
	private String dish;
	
	public CancelOrderCommand(Kitchen kitchen, String dish) {
		this.kitchen = kitchen;
		this.dish = dish;
	}
	
	@Override
	public void execute() {
		kitchen.cancelDish(dish);
	}

	@Override
	public void undo() {
		kitchen.prepareDish(dish);
	}

}
