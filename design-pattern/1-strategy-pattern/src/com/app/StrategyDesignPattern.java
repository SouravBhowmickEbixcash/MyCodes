package com.app;

import com.app.client.CompanionRobot;
import com.app.client.Robot;
import com.app.client.WorkerRobot;
import com.app.strategies.impl.NoFly;
import com.app.strategies.impl.NoWalk;
import com.app.strategies.impl.NormalFly;
import com.app.strategies.impl.NormalTalk;
import com.app.strategies.impl.NormalWalk;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		
		Robot robot1 = new CompanionRobot(new NormalFly(), new NormalTalk(), new NoWalk());
		robot1.fly();
		robot1.talk();
		robot1.walk();
		
		System.out.println("________________________________________________________");
		Robot robot2 = new WorkerRobot(new NoFly(), new NormalTalk(), new NormalWalk());
		robot2.fly();
		robot2.talk();
		robot2.walk();

	}

}
