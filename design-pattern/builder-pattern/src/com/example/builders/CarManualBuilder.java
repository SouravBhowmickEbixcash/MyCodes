package com.example.builders;

import com.example.cars.CarsType;
import com.example.cars.Manual;
import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;

public class CarManualBuilder implements Builder<Manual>{
	private CarsType carsType;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private GPSNavigator gpsNavigator;
	
	@Override
	public Builder<Manual> setCarsType(CarsType carsType) {
		this.carsType = carsType; 
		return this;
	}

	@Override
	public Builder<Manual> setSeats(int seats) {
		this.seats = seats;
		return this;
	}

	@Override
	public Builder<Manual> setEngine(Engine engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public Builder<Manual> setTransmission(Transmission transmission) {
		this.transmission = transmission;
		return this;
	}

	@Override
	public Builder<Manual> setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
		return this;
	}
	
	
	public Manual build() {
		return new Manual(carsType, seats, engine, transmission, gpsNavigator);
	}

}
