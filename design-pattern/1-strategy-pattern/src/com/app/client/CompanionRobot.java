package com.app.client;

import com.app.strategies.FlyableRobot;
import com.app.strategies.TalkableRobot;
import com.app.strategies.WalkableRobot;

public class CompanionRobot extends Robot{

	public CompanionRobot(FlyableRobot flyBehaviour, TalkableRobot talkBehaviour, WalkableRobot walkBehaviour) {
		super(flyBehaviour, talkBehaviour, walkBehaviour);
	}

	@Override
	public void projection() {
		System.out.println("Displaying friendly companion features...");
		
	}

}
