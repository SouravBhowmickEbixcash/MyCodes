package com.example.app;

public class Test {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("Same");
		}else {
			System.out.println("Same");
		}

	}

}
