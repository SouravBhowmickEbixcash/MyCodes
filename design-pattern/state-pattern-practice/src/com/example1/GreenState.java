package com.example1;

public class GreenState implements TrafficLightState{

	@Override
	public void change(TrafficLight context) {
		System.out.println("GREEN Light - Go");
		context.setState(new YellowState());
	}

}
