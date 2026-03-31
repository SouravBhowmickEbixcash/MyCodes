package com.example1;

public interface WeatherSubject {
	void register(WeatherObserver observer);
	void remove(WeatherObserver observer);
	void notifyObservers();
}
