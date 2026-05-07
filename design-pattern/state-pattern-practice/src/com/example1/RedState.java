package com.example1;

public class RedState implements TrafficLightState{

	@Override
	public void change(TrafficLight context) {
		System.out.println("RED Light - Stop");
		context.setState(new GreenState());
	}

}
