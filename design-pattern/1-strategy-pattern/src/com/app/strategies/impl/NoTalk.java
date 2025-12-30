package com.app.strategies.impl;

import com.app.strategies.TalkableRobot;

public class NoTalk implements TalkableRobot{

	@Override
	public void talk() {
		System.out.println("Cannot Talk...");
		
	}

}
