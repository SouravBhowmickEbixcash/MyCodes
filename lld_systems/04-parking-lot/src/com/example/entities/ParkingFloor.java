package com.example.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.example.enums.VehicleSize;

public class ParkingFloor {
	private final int floorNumber;
	private final List<ParkingSpot> spots;
	
	public ParkingFloor (int floorNumber, Map<VehicleSize, Integer> spotsCount) {
		this.floorNumber = floorNumber;
		this.spots = new ArrayList<>();
		initialize(spotsCount);
	}
	
	private void initialize(Map<VehicleSize, Integer> spotsCount) {
		for(VehicleSize size : VehicleSize.values()) {
			int count = spotsCount.getOrDefault(size, 0);
			String prefix = getSizePrefix(size);
			for(int i = 0; i < count; i++) {
				String spotId = String.format("F%d-%s%03d", floorNumber, prefix, i);
				spots.add(new ParkingSpot(spotId, size));
			}
		}
	}

	private String getSizePrefix(VehicleSize size) {
		switch(size) {
		case SMALL : return "S";
		case MEDIUM : return "M";
		case LARGE : return "L";
		default : return "X";
		}
	}
	
	
	public ParkingSpot findAvailableSpot(VehicleSize size){
		for(ParkingSpot spot : spots) {
			if(spot.isAvailable() && spot.getSize().equals(size)) {
				return spot;
			}
		}
		
		return null;
	}
	
	public int getAvailableSpotCount(VehicleSize size) {
		int count = 0;
		for(ParkingSpot spot : spots) {
			if(spot.isAvailable() && spot.getSize().equals(size)) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	
	public List<ParkingSpot> getSpots(){
		return Collections.unmodifiableList(spots);
	}
}
