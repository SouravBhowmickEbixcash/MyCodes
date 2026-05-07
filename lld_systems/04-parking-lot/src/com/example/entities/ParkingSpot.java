package com.example.entities;

import com.example.enums.VehicleSize;
import com.example.exceptions.ParkingException;

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
	
	
	public synchronized void parkVehicle(Vehicle vehicle) {
		if(!isAvailable()) {
			throw new ParkingException("Spot : " + spotId + " is already occupied!!");
		}
		
		if(!canFitVehicle(vehicle.getSize())) {
			throw new ParkingException("Vehicle size : " + vehicle.getSize() + " cannot fit in spot size " + size);
		}
		
		this.parkedVehicle = vehicle;
	}
	
	
	public synchronized Vehicle unparkVehicle () {
		if(isAvailable()) {
			throw new ParkingException("Spot : "+ spotId + " is Already empty!!");
		}
		
		Vehicle vehicle = this.parkedVehicle;
		this.parkedVehicle = null;
		return vehicle;
	}
	
	
	public String getSpotId() {
		return this.spotId;
	}
	
	public VehicleSize getSize() {
		return this.size;
	}
	
	
	public Vehicle getParkedVehicle () {
		return this.parkedVehicle;
	}
}
