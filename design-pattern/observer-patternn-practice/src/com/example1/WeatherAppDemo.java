package com.example1;

public class WeatherAppDemo {

	public static void main(String[] args) {
        WeatherStation station = new WeatherStation(0, 0, 0);
        CurrentConditionsDisplay current = new CurrentConditionsDisplay();
        StatisticsDisplay stats = new StatisticsDisplay();
        station.register(current);
        station.register(stats);
        station.setMeasurements(25.0, 65.0, 1013.0);
        station.setMeasurements(28.0, 70.0, 1012.0);
        station.setMeasurements(22.0, 90.0, 1011.0);

	}

}
