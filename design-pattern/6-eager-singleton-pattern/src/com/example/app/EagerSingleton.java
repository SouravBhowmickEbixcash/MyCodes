package com.example.app;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		System.out.println("Eager singleton class created!!");
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}

}
