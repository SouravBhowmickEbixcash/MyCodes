package com.example1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Waiter {
	private Queue<OrderCommand> pendingOrders;
	private Stack<OrderCommand> history;
	
	public Waiter() {
		this.pendingOrders = new LinkedList<>();
		this.history = new Stack<>();
	}
	
	public void takeOrder(OrderCommand command) {
		this.pendingOrders.offer(command);
	}
	
	public void submitOrders() {
		while(!pendingOrders.isEmpty()) {
			OrderCommand currCommand = pendingOrders.poll();
			currCommand.execute();
			history.push(currCommand);
		}
	}
	
	public void undoLast() {
		if(!history.isEmpty()) {
			OrderCommand lastCommand = history.pop();
			lastCommand.undo();
		}
	}
}
