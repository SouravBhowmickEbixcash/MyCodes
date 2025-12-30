package com.example.app;

public class Test {
	
	public static void main(String[] args) {
		EagerSingleton s1 = EagerSingleton.getInstance();
		EagerSingleton s2 = EagerSingleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("Same");
		}else {
			System.out.println("Same");
		}
	}
}

