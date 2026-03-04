package com.example1;

public class Counter {
	
	private long counter;
	private static Counter instance = null;
	
	private Counter () {
		this.counter = 0;
	}
	
	
	public static Counter getInstance() {
		if(instance == null) {
			synchronized (Counter.class) {
				if(instance == null) {
					instance = new Counter();
				}
			}
		}
		
		return instance;
	}
	
	public void increment() {
		synchronized (instance) {
			counter++;
		}
		System.out.println("Counter incremented successfully!!");
	}
	
	
	public long getCount() {
		return counter;
	}
}
