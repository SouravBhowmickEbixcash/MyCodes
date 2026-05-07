package com.example.strategies;

import com.example.entities.ParkingTicket;

public class HourlyBasedFeeStrategy implements FeeStrategy{
	
	private final double ratePerHour;
	
	public HourlyBasedFeeStrategy (double ratePerHour) {
		this.ratePerHour = ratePerHour;
	} 
	@Override
	public double calculateFee(ParkingTicket ticket) {
		long hours = ticket.getDurationInHours();
		return ratePerHour*hours;
	}
	
}
