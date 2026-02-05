package com.example.client;

import com.example.facade.DeploymentFacade;

public class DeploymentApp {

	public static void main(String[] args) {
		DeploymentFacade deploymentFacade = new DeploymentFacade();
		deploymentFacade.deployApplication("main", "prod.server.example.com");

	}

}
