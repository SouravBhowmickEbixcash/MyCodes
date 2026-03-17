package com.examples2;

public class UserRepository extends Repository{

	public UserRepository(DatabaseDriver driver) {
		super(driver);
	}
	
	
	public void findById(String id) {
		driver.connect();
		String query = "SELECT * FROM users WHERE id = " + id;
		driver.execute(query);
		driver.close();
	}
	
	
	public void save(String name, String email) {
		driver.connect();
		String query = "INSERT INTO users VALUES ( " + name + " , " + email + " )";
		driver.execute(query);
		driver.close();
	}

}
