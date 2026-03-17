package com.example3;

import java.util.HashMap;
import java.util.Map;

public class CachingWeatherProxy implements WeatherService{
	private WeatherService realService;
	private Map<String, CacheEntry> cache = new HashMap<>();
	private static final int TTL_MS = 500;

    public CachingWeatherProxy(WeatherService realService) {
        this.realService = realService;
    }
	@Override
	public String getTemperature(String city) {
        long now = System.currentTimeMillis();
        if (cache.containsKey(city)) {
            CacheEntry entry = cache.get(city);
            long age = (now - entry.timestamp) / 1000;
            if (now - entry.timestamp <= TTL_MS) {
                System.out.println("CachingProxy: Cache HIT for " + city + " (age: " + age + "s)");
                return entry.result;
            } else {
                System.out.println("CachingProxy: Cache EXPIRED for " + city + " (age: " + age + "s)");
            }
        } else {
            System.out.println("CachingProxy: Cache MISS for " + city);
        }
        String result = realService.getTemperature(city);
        cache.put(city, new CacheEntry(result, System.currentTimeMillis()));
        return result;
	}

}
