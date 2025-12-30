package com.app.strategies.impl;

import com.app.strategies.FlyableRobot;

public class NoFly implements FlyableRobot{

	@Override
	public void fly() {
		System.out.println("Cannot Fly...");
	}

}
