package com.example.subsystems;

public class VersionControlSystem {
	
	public void pullLatestChanges(String branch) {
		System.out.println("VCS : Pulling latest changes from " + branch + "...");
		simulateDelay();
		System.out.println("VCS : Pull completed.");
	}
	
	
	private void simulateDelay() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
