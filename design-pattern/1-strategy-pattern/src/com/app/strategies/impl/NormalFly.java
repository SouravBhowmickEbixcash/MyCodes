package com.app.strategies.impl;

import com.app.strategies.FlyableRobot;

public class NormalFly implements FlyableRobot{

	@Override
	public void fly() {
		System.out.println("Flying normally...");
	}

}
