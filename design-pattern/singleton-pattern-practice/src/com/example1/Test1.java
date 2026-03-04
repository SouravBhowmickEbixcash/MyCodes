package com.example1;

public class Test1 {

	public static void main(String[] args) {
		
        // After implementing, usage should look like:
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();
        System.out.println("Same instance: " + (c1 == c2));
        for (int i = 0; i < 5; i++) {
           c1.increment();
        }
        System.out.println("Count after 5 increments: " + c1.getCount());

	}

}
