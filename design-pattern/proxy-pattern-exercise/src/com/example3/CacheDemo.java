package com.example3;

public class CacheDemo {

	public static void main(String[] args) throws InterruptedException {
        WeatherService weather = new CachingWeatherProxy(new RealWeatherService());

        System.out.println(weather.getTemperature("London"));
        System.out.println(weather.getTemperature("London"));
        System.out.println(weather.getTemperature("Paris"));

        System.out.println("\nWaiting 1 second for cache to expire...");
        Thread.sleep(1000);

        System.out.println(weather.getTemperature("London"));

	}

}
