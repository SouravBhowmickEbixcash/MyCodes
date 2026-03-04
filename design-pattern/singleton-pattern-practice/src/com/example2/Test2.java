package com.example2;

public class Test2 {

	public static void main(String[] args) {
        // After implementing, usage should look like:
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        System.out.println("Same instance: " + (l1 == l2));
        l1.setLevel(Logger.Level.ERROR);
        l1.debug("Starting up");
        l1.info("Server listening on port 8080");
        l1.warn("Connection pool running low");
        l1.error("Failed to connect to database");

	}

}
