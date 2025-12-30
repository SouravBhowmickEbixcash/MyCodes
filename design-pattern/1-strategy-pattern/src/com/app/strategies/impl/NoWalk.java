package com.app.strategies.impl;

import com.app.strategies.WalkableRobot;

public class NoWalk implements WalkableRobot{

	@Override
	public void walk() {
		System.out.println("Cannot Walk...");
		
	}

}
