package com.example1;

public class TrafficLightController {
	
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
        light.change(); // RED light - Stop
        light.change(); // GREEN light - Go
        light.change(); // YELLOW light - Slow down
        light.change(); // RED light - Stop
        light.change(); // GREEN light - Go
	}

}
