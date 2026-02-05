package com.example.subsystems;

public class DeploymentTarget {
	
	
	public void transferArtifact(String artifactPath, String server) {
		System.out.println("Deployment : transferring " + artifactPath + " to server " + server + "...");
		simulateDelay(300);
		System.out.println("Deployment : Deploying Artifact completed...");
	}
	
	
	public void activateNewVersion(String server) {
		System.out.println("Deployment : Activating new version on " + server + " server...");
		simulateDelay(200);
		System.out.println("Deployment : Now Live on " + server);
	}
	
	
	private void simulateDelay(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
