package com.example.strategies;

import java.util.List;

import com.example.entities.ParkingFloor;
import com.example.entities.ParkingSpot;
import com.example.enums.VehicleSize;

public interface SpotAllocationStrategy {
	ParkingSpot findSpot(List<ParkingFloor> floors, VehicleSize size);
}
