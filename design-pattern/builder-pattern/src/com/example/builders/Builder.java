package com.example.builders;

import com.example.cars.CarsType;
import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;

public interface Builder<T> {
	
	Builder<T> setCarsType(CarsType carsType);
	Builder<T> setSeats(int seats);
	Builder<T> setEngine(Engine engine);
	Builder<T> setTransmission(Transmission transmission);
	Builder<T> setGPSNavigator(GPSNavigator gpsNavigator);
	T build();
}
