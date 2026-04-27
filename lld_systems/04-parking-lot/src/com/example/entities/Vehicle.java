package com.example.entities;

import com.example.enums.VehicleSize;

public abstract class Vehicle {
	
	private final String licensePlate;
	private final VehicleSize size;
	
	public Vehicle(String licensePlate, VehicleSize size) {
		if(licensePlate == null || licensePlate.trim().isEmpty()) {
			throw new IllegalArgumentException("License Plate cannot be null or empty!!");
		}
		this.licensePlate = licensePlate;
		this.size = size;
	}
	
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public VehicleSize getSize() {
		return size;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + licensePlate + "]";
	}
	

}
