package com.example3;

public class RealWeatherService implements WeatherService{
	private int callCount = 0;

	@Override
	public String getTemperature(String city) {
        System.out.println("RealWeatherService: Fetching weather for " + city + "...");
        int temp = 20 + (callCount++ * 5);
        return city + ": " + temp + "C";
	}

}
