package com.example.entities;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.example.enums.VehicleSize;
import com.example.exceptions.ParkingException;
import com.example.strategies.FeeStrategy;
import com.example.strategies.SpotAllocationStrategy;

public class ParkingLot {
	private static volatile ParkingLot instance;
	private static final Object lock = new Object();
	
	private List<ParkingFloor> floors;
	private final Map<String, ParkingTicket> activeTickets;
	private FeeStrategy feeStrategy;
	private SpotAllocationStrategy spotAllocationStrategy;
	
	
	private ParkingLot() {
		this.activeTickets = new HashMap<>();
	}
	
	public static ParkingLot getInstance() {
		if(instance == null) {
			synchronized (lock) {
				if(instance == null) {
					instance = new ParkingLot();
				}
			}
		}
		
		return instance;
	}
	
	public void initialize(List<ParkingFloor> floors, FeeStrategy feeStrategy, SpotAllocationStrategy spotAllocationStrategy) {
		this.floors = floors;
		this.feeStrategy = feeStrategy;
		this.spotAllocationStrategy = spotAllocationStrategy;
	}      
	
	
	public ParkingTicket parkVehicle(Vehicle vehicle) {
		ParkingSpot spot = spotAllocationStrategy.findSpot(floors, vehicle.getSize());
		
		if(spot == null) {
			throw new ParkingException("No spot avalible for size " + vehicle.getSize());
		}
		
		spot.parkVehicle(vehicle);
		
		String ticketId = UUID.randomUUID().toString().substring(0, 8);
		ParkingTicket ticket = new ParkingTicket(ticketId, vehicle, spot);
		activeTickets.put(ticketId, ticket);
		
		System.out.println("Parked " + vehicle + " at spot " + spot.getSpotId() + ", Ticket : " + ticketId);
		
		return ticket;
	}
	
	
	public double unparkVehicle(String ticketId) {
		ParkingTicket ticket = activeTickets.get(ticketId);
		
		if(ticket == null) {
			throw new ParkingException("Invalid Ticket : " + ticketId);
		}
		
		ticket.setExitTime(LocalDateTime.now());
		double fee = feeStrategy.calculateFee(ticket);
		
		ticket.getSpot().unparkVehicle();
		
		activeTickets.remove(ticketId);
		
        System.out.printf("Unparked %s from spot %s. Fee: $%.2f%n",
                ticket.getVehicle(), ticket.getSpot().getSpotId(), fee);
        
        return fee;
	}
	
	
	public void displayAvailability() {
		System.out.println("\n===== PARKING AVAILABILITY =====");
        for (ParkingFloor floor : floors) {
            StringBuilder sb = new StringBuilder();
            sb.append("Floor ").append(floor.getFloorNumber()).append(": ");

            for (VehicleSize size : VehicleSize.values()) {
                int count = 0;
                for (ParkingSpot spot : floor.getSpots()) {
                    if (spot.isAvailable() && spot.getSize() == size) {
                        count++;
                    }
                }
                sb.append(size).append("=").append(count);
                if (size.ordinal() < VehicleSize.values().length - 1) {
                    sb.append(", ");
                }
            }
            System.out.println(sb);
        }
        System.out.println("================================\n");
	}
	
	
	public void setFeeStrategy(FeeStrategy strategy) {
		this.feeStrategy = strategy;
	}
	
	public void setAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
		this.spotAllocationStrategy = spotAllocationStrategy;
	}
	
	
	public static void resetInstence() {
		synchronized (lock) {
			instance = null;
		}
	}
}
