package com.example.entities;

import com.example.enums.VehicleSize;

public class ParkingSpot {
	private final String spotId;
	private final VehicleSize size;
	private Vehicle parkedVehicle;
	
	public ParkingSpot(String spotId, VehicleSize size) {
		this.spotId = spotId;
		this.size = size;
	}
	
	
	public boolean isAvailable() {
		return parkedVehicle == null;
	}
	
	public boolean canFitVehicle(VehicleSize vehicleSize) {
		return vehicleSize.ordinal() <= size.ordinal();
	} 
}
