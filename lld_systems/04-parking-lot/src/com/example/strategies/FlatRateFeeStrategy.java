package com.example.strategies;

import com.example.entities.ParkingTicket;

public class FlatRateFeeStrategy implements FeeStrategy{
	
	private final double flatRate;
	
	public FlatRateFeeStrategy (double flatRate) {
		this.flatRate = flatRate;
	}
	@Override
	public double calculateFee(ParkingTicket ticket) {
		return flatRate;
	}

}
