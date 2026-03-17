package com.examples2;

public class DatabaseAbstractionLayerDemo {

	public static void main(String[] args) {
        DatabaseDriver pg = new PostgresDriver();
        UserRepository userRepo = new UserRepository(pg);
        userRepo.findById("42");
        userRepo.save("Alice", "alice@example.com");

	}

}
