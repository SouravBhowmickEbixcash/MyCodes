package com.example.strategies;

import java.util.List;

import com.example.entities.ParkingFloor;
import com.example.entities.ParkingSpot;
import com.example.enums.VehicleSize;

public class NearestFirstStrategy implements SpotAllocationStrategy{

	@Override
	public ParkingSpot findSpot(List<ParkingFloor> floors, VehicleSize size) {
		for(ParkingFloor floor : floors) {
			ParkingSpot spot = floor.findAvailableSpot(size);
			if(spot != null) {
				return spot;
			}
		}
		return null;
	}
	
}
