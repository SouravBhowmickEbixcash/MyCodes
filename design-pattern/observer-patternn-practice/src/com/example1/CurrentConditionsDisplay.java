package com.example1;

public class CurrentConditionsDisplay implements WeatherObserver{
	private double temperature;
	private double humidity;
	private double pressure;
	
	@Override
	public void update(WeatherSubject weather) {
		if(weather instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) weather;
			this.temperature = weatherStation.getTemperature();
			this.humidity = weatherStation.getHumidity();
			this.pressure = weatherStation.getPressure();
		}
		this.display();
	}
	
	
	
	private void display() {
		System.out.println("*********************** CURRENT CONDITION DISPLAY ***************************");
		System.out.println("Temperature : " + temperature);
		System.out.println("Humidity : " + humidity);
		System.out.println("Pressure : " + pressure);
	}

}
