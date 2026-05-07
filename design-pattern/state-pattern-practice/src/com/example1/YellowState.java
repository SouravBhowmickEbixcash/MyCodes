package com.example1;

public class YellowState implements TrafficLightState{

	@Override
	public void change(TrafficLight context) {
		System.out.println("YELLOW Light - Slow Down");
		context.setState(new RedState());
	}

}
