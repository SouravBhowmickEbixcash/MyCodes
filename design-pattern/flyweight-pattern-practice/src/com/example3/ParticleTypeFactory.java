package com.example3;

import java.util.HashMap;
import java.util.Map;

public class ParticleTypeFactory {
	private Map<String, ParticleType> cache;
	
	public ParticleTypeFactory() {
		this.cache = new HashMap<>();
	}
	
	public ParticleType getType(String name, String color, String sprite, String blendMode) {
		String cacheKey = name+"_"+color+"_"+sprite+"_"+blendMode;
		if(!cache.containsKey(cacheKey)) {
			cache.put(cacheKey, new ConcreteParticleType(name, color, sprite, blendMode));
		}
		
		return cache.get(cacheKey);
	}
	
	
	public int getTypeCount() {
		return cache.size();
	}
}
