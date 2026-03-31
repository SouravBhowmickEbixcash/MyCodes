package com.example1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject{
	
	private double temperature;
	private double humidity;
	private double pressure;
	private List<WeatherObserver> observers;
	
	public WeatherStation(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(WeatherObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(WeatherObserver observer) {
		this.observers.remove(observer);	
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notifying all the subscribed observers!!");
		for(WeatherObserver observer : observers) {
			observer.update(this);
		}
	}
	
    public void setMeasurements(double temperature, double humidity, double pressure) {
    	this.temperature = temperature;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	this.notifyObservers();
    }
	
	public double getTemperature() {
		return this.temperature;
	}
	
	
	public double getHumidity() {
		return this.humidity;
	}
	
	public double getPressure() {
		return this.pressure;
	}


}
