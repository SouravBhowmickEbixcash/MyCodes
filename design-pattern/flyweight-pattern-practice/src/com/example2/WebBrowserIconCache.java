package com.example2;

public class WebBrowserIconCache {
	public static void main(String[] args) {
        IconCacheFactory cache = new IconCacheFactory(3);

        cache.getIcon("favicon", "blue", 16).display("google.com", 10, 10);
        cache.getIcon("bookmark", "gold", 24).display("github.com", 30, 10);
        cache.getIcon("history", "gray", 16).display("stackoverflow.com", 50, 10);
        cache.getIcon("favicon", "blue", 16).display("google.com", 70, 10);  // HIT
        cache.getIcon("download", "green", 32).display("example.com", 90, 10);  // evicts LRU

        System.out.println("Cache size: " + cache.getCacheSize());
	}
}
