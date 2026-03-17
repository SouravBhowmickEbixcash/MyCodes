package com.example1;

import java.util.ArrayList;
import java.util.List;

public class RateLimitingProxy implements ApiService{
	private ApiService realService;
	private List<Long> timestamps;
	private static final int MAX_REQUESTS = 3;
	private static final long TIME_WINDOW_MS = 10_000;
	
	public RateLimitingProxy(ApiService apiService) {
		this.realService = apiService;
		this.timestamps = new ArrayList<>();
	}

	@Override
	public String request(String endPoint) {
        long now = System.currentTimeMillis();
        timestamps.removeIf(t -> now - t > TIME_WINDOW_MS);
        if (timestamps.size() >= MAX_REQUESTS) {
            return "Rate limit exceeded. Try again later.";
        }
        timestamps.add(now);
        return realService.request(endPoint);
	}

}
