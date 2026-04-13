package com.example.entity;

import java.util.Random;

public class Dice {
	private int minValue;
	private int maxValue;
	
	
	public Dice(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	
	public int roll() {
		Random rand = new Random();
		return rand.nextInt(maxValue) + minValue;
	}
}
