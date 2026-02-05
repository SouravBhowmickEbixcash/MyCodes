package com.example.subsystems;

public class TestingFramework {
	
	public boolean runUnitTest() {
		System.out.println("TestingFramework : Starting Unit Test...");
		simulateDelay(2000);
		System.out.println("TestingFramework : Unit Test Completed Successfully...");
		return true;
	}
	
	
	public boolean runIntegrationTest() {
		System.out.println("TestingFramework : Starting Integration Test...");
		simulateDelay(3000);
		System.out.println("TestingFramework : Integeration Test Completed...");
		return true;
	}
	
	
	private void simulateDelay(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
