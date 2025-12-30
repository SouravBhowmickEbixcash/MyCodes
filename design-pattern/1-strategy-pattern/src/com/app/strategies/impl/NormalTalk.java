package com.app.strategies.impl;

import com.app.strategies.TalkableRobot;

public class NormalTalk implements TalkableRobot{

	@Override
	public void talk() {
		System.out.println("Talking Normally...");
		
	}

}
