package com.example.builders;

import com.example.cars.Car;
import com.example.cars.CarsType;
import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;

public class CarBuilder implements Builder<Car>{
	private CarsType carsType;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private GPSNavigator gpsNavigator;
	
	@Override
	public Builder<Car> setCarsType(CarsType carsType) {
		this.carsType = carsType;
		return this;
	}

	@Override
	public Builder<Car> setSeats(int seats) {
		this.seats = seats;
		return this;
	}

	@Override
	public Builder<Car> setEngine(Engine engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public Builder<Car> setTransmission(Transmission transmission) {
		this.transmission = transmission;
		return this;
	}

	@Override
	public Builder<Car> setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
		return this;
	}
	
	public Car build() {
		return new Car(carsType, engine, seats, gpsNavigator, transmission, 3);
	}

}
