package com.example.strategies;

import com.example.entities.ParkingTicket;

public interface FeeStrategy {
	double calculateFee(ParkingTicket ticket);
}
