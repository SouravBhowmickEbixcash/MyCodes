package com.example.entities;

import com.example.enums.VehicleSize;

public class Truck extends Vehicle{

	public Truck(String licensePlate) {
		super(licensePlate, VehicleSize.LARGE);
	}

}
