package com.example2;

import java.util.LinkedHashMap;

public class IconCacheFactory {
	
	private int maxCapacity;
	private LinkedHashMap<String, PageIcon> cache;
	
	
	public IconCacheFactory(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.cache = new LinkedHashMap<>(16, 0.75f, true);
	}
	
	
    public PageIcon getIcon(String iconType, String color, int size) {
        String key = iconType + "_" + color + "_" + size;
        if (cache.containsKey(key)) {
            System.out.println("Cache HIT: " + key);
            return cache.get(key);
        }
        if (cache.size() >= maxCapacity) {
            String lruKey = cache.keySet().iterator().next();
            cache.remove(lruKey);
            System.out.println("Evicting icon: " + lruKey);
        }
        System.out.println("Cache MISS: " + key);
        PageIcon icon = new ConcretePageIcon(iconType, color, size);
        cache.put(key, icon);
        return icon;
    }

    public int getCacheSize() {
        return cache.size();
    }
}
