package com.example.entities;

import com.example.enums.VehicleSize;

public class Car extends Vehicle{

	public Car(String licensePlate) {
		super(licensePlate, VehicleSize.MEDIUM);
	}
	
}
