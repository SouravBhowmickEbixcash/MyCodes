package com.example.strategies;

import java.util.Map;

import com.example.entities.ParkingTicket;
import com.example.enums.VehicleSize;

public class VehicleBasedFeeStrategy implements FeeStrategy{
	
	private final Map<VehicleSize, Double> ratePerHour;
	
	
	public VehicleBasedFeeStrategy (Map<VehicleSize, Double> ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
	@Override
	public double calculateFee(ParkingTicket ticket) {
		VehicleSize size = ticket.getVehicle().getSize();
		double rate = ratePerHour.get(size);
		long hours = ticket.getDurationInHours();
		return rate*hours;
	}

}
