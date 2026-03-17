package com.examples2;

public class OrderRepository extends Repository{

	public OrderRepository(DatabaseDriver driver) {
		super(driver);
	}
	
	public void findByUserId(String userId) {
		driver.connect();
		String query = "SELECT * FROM orders WHERE userId = " + userId;
		driver.execute(query);
		driver.close();
	}
	
	
	public void createOrder(String userId, String product, double amount) {
		driver.connect();
		String query = "INSERT INTO orders VALLUES ( " + userId + " , " + product + " , " + amount + ")";
		driver.execute(query);
		driver.close();
	}

}
