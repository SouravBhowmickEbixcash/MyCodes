package com.example.entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingTicket {
	private final String ticketId;
	private final Vehicle vehicle;
	private final ParkingSpot spot;
	private final LocalDateTime entryTime;
	private LocalDateTime exitTime;
	
	public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpot spot) {
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.spot = spot;
		this.entryTime = LocalDateTime.now();
	}
	
	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}
	
	public long getDurationInHours() {
		LocalDateTime end = exitTime != null ? exitTime : LocalDateTime.now();
		long hours = ChronoUnit.HOURS.between(entryTime, end);
		return Math.max(hours, 1);
	}
	
	
	public String getTicketId() {
		return this.ticketId;
	}
	
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	public ParkingSpot getSpot() {
		return this.spot;
	}
	
	
	public LocalDateTime getEntryTime() {
		return this.entryTime;
	}
	
	
	public LocalDateTime getExitTime() {
		return this.exitTime;
	}
}
