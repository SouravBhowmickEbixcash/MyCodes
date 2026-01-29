package com.example.registry;

import java.util.HashMap;
import java.util.Map;

import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Shape;

public class BundledShapeCache {
	
	Map<String, Shape> cache = new HashMap<>();
	
	public BundledShapeCache() {
		Circle circle = new Circle();
		circle.setX(5);
		circle.setY(7);
		circle.setColor("Green");
		circle.setRadius(10);
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(6);
		rectangle.setY(9);
		rectangle.setLength(8);
		rectangle.setBreadth(10);
		rectangle.setColor("Blue");
		
		cache.put("Big Green Circle", circle);
		cache.put("Big Blue Rectangle", rectangle);
	}
	
	public void addShapePrototype(String key, Shape shape) {
		cache.put(key, shape);
	}
	
	
	public Shape getPrototype(String key) {
		return cache.get(key);
	}
	
	
	public void deletePrototype(String key) {
		cache.remove(key);
	}
}
