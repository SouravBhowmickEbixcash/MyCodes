package com.example.cars;

import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;

public class Car {
	
	private CarsType carsType;
	private Engine engine;
	private int seats;
	private GPSNavigator gpsNavigator;
	private Transmission transmission;
	private double fuel;
	
	public Car(CarsType carsType, Engine engine, int seats, GPSNavigator gpsNavigator, Transmission transmission, double fuel) {
		this.carsType = carsType;
		this.engine = engine;
		this.seats = seats;
		this.gpsNavigator = gpsNavigator;
		this.transmission = transmission;
		this.fuel = fuel;
	}

	public int getSeats() {
		return seats;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}



	public CarsType getCarsType() {
		return carsType;
	}

	public void setCarsType(CarsType carsType) {
		this.carsType = carsType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public void setGpsNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	
}
