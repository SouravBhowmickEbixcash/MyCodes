package com.example.app;


// 1) Make the constructor private
// 2) Make a static method that will return the instance of the class even if it is new or the created one
// 3) Make a static variable to store the one created instance of the same class and also make it private
public class Singleton {
	
	private static Singleton instance = null;

	private Singleton () {
		System.out.println("Singleton Class created!!");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	} 

}
