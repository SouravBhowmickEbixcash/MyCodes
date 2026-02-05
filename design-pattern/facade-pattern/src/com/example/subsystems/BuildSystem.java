package com.example.subsystems;

public class BuildSystem {
	
	public boolean compileProject() {
		System.out.println("BuildSystem : Compiling Project...");
		simulateDelay(2000);
		System.out.println("BuildSystem : Build Successful...");
		return true;
	}
	
	public String getArtifactPath() {
		String path = "target/my-application-v1.jar";
		System.out.println("BuildSystem : Artifact located at " + path);
		return path;
	}
	
	
	private void simulateDelay(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
