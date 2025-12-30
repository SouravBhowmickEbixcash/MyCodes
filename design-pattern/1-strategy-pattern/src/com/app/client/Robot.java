package com.app.client;

import com.app.strategies.FlyableRobot;
import com.app.strategies.TalkableRobot;
import com.app.strategies.WalkableRobot;

public abstract class Robot {
	
	private FlyableRobot flyBehaviour;
	private TalkableRobot talkBehaviour;
	private WalkableRobot walkBehaviour;
	
	public Robot (FlyableRobot flyBehaviour, TalkableRobot talkBehaviour, WalkableRobot walkBehaviour) {
		this.talkBehaviour = talkBehaviour;
		this.walkBehaviour = walkBehaviour;
		this.flyBehaviour = flyBehaviour;
	}
	
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void talk() {
		talkBehaviour.talk();
	}
	
	public void walk() {
		walkBehaviour.walk();
	}
	
	
	public abstract void projection();
}
