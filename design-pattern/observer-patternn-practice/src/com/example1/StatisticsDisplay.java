package com.example1;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements WeatherObserver{

	private List<Double> temperatureRecords;
	private double sum;
	
	public StatisticsDisplay() {
		this.temperatureRecords = new ArrayList<>();
		this.sum = 0;
	}
	
	@Override
	public void update(WeatherSubject weather) {
		if(weather instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) weather;
			temperatureRecords.add(weatherStation.getTemperature());
			sum += weatherStation.getTemperature();
		}
		display();
	}
	
	
	private void display() {
		System.out.println("************************* Statistics Display *************************");
		System.out.println("Average Temperature : " + sum/temperatureRecords.size());
	}

}
