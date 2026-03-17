package com.example1;

public class ProxyDemo {
	
	public static void main(String[] args) {
        ApiService api = new RateLimitingProxy(new RealApiService());

        System.out.println(api.request("/users"));
        System.out.println(api.request("/orders"));
        System.out.println(api.request("/products"));
        System.out.println(api.request("/inventory")); // Should be rejected
	}

}
