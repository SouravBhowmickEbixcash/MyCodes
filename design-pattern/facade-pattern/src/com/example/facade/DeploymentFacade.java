package com.example.facade;

import com.example.subsystems.BuildSystem;
import com.example.subsystems.DeploymentTarget;
import com.example.subsystems.TestingFramework;
import com.example.subsystems.VersionControlSystem;

public class DeploymentFacade {
	private VersionControlSystem versionControlSystem;
	private BuildSystem buildSystem;
	private TestingFramework testingFramework;
	private DeploymentTarget deploymentTarget;
	
	
	public DeploymentFacade() {
		this.versionControlSystem = new VersionControlSystem();
		this.buildSystem = new BuildSystem();
		this.testingFramework = new TestingFramework();
		this.deploymentTarget = new DeploymentTarget();
	}
	
	
	public boolean deployApplication(String branch, String serverAddress) {
		System.out.println("\nFACADE : ---- Initiating FULL DEPLOYMENT for branch: " + branch + " to " + serverAddress + "----");
		boolean success = true;
		
		try {
			versionControlSystem.pullLatestChanges(branch);
			
			if(!buildSystem.compileProject()) {
				System.err.println("FACADE : DEPLOYMENT FAILED - Build Compilation Failed...");
				return false;
			}
			
			String artifactPath = buildSystem.getArtifactPath();
			
			if (!testingFramework.runIntegrationTest()) {
                System.err.println("FACADE: DEPLOYMENT FAILED - Integration tests failed.");
                return false;
            }

            deploymentTarget.transferArtifact(artifactPath, serverAddress);
            deploymentTarget.activateNewVersion(serverAddress);
            System.out.println("FACADE: APPLICATION DEPLOYED SUCCESSFULLY to " + serverAddress + "!");
            
		}catch (Exception e) {
            System.err.println("FACADE: DEPLOYMENT FAILED - An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            success = false;
        }
		
		
		return success;
	}
}
