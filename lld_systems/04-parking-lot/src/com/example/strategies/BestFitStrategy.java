package com.example.strategies;

import java.util.List;

import com.example.entities.ParkingFloor;
import com.example.entities.ParkingSpot;
import com.example.enums.VehicleSize;

public class BestFitStrategy implements SpotAllocationStrategy{

	@Override
	public ParkingSpot findSpot(List<ParkingFloor> floors, VehicleSize size) {
		for(ParkingFloor floor : floors) {
			for(ParkingSpot spot : floor.getSpots()) {
				if(spot.isAvailable() && spot.getSize() == size) {
					return spot;
				}
			}
		}
		
		for(VehicleSize v : size.values()) {
			if(v.ordinal() < size.ordinal()) {
				continue;
			} 
			
			for(ParkingFloor floor : floors) {
				for(ParkingSpot spot : floor.getSpots()) {
					if(spot.isAvailable() && spot.getSize() == v) {
						return spot;
					}
				}
			}
		}
		
		return null;
	}

}
