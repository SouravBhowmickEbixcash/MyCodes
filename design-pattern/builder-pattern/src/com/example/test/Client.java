package com.example.test;

import com.example.builders.Builder;
import com.example.builders.CarBuilder;
import com.example.builders.CarManualBuilder;
import com.example.cars.Car;
import com.example.cars.CarsType;
import com.example.cars.Manual;
import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;

public class Client {

	public static void main(String[] args) {
		
		CarBuilder carBuilder = new CarBuilder();
		Car car1 = carBuilder.setCarsType(CarsType.SPORTS_CAR)
				.setEngine(new Engine(3.0, 0))
				.setGPSNavigator(new GPSNavigator())
				.setSeats(2)
				.setTransmission(Transmission.MANUAL)
				.build();
		
		System.out.println("Car built:\n" + car1.getCarsType());
		
		Builder<Manual> carManualBuilder = new CarManualBuilder();
		Manual manual1 = carManualBuilder.setCarsType(CarsType.SPORTS_CAR)
				.setEngine(new Engine(3.0, 0))
				.setGPSNavigator(new GPSNavigator())
				.setSeats(2)
				.setTransmission(Transmission.MANUAL)
				.build();
		
		System.out.println("\nCar manual built:\n" + manual1.print());
	}

}
