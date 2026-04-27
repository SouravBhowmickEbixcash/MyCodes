package com.example.entities;

import com.example.enums.VehicleSize;

public class Bike extends Vehicle{
	
	public Bike(String licensePlate) {
		super(licensePlate, VehicleSize.SMALL);
	}
}
