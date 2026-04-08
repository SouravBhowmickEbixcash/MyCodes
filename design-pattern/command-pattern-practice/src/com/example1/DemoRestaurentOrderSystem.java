package com.example1;

public class DemoRestaurentOrderSystem {

	public static void main(String[] args) {
		Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        waiter.takeOrder(new PlaceOrderCommand(kitchen, "Pasta"));
        waiter.takeOrder(new PlaceOrderCommand(kitchen, "Salad"));
        waiter.submitOrders();
        waiter.takeOrder(new CancelOrderCommand(kitchen, "Salad"));
        waiter.submitOrders();
        waiter.undoLast(); // undo the cancellation

	}

}
