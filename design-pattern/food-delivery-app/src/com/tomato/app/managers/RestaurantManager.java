package com.tomato.app.managers;

import java.util.ArrayList;
import java.util.List;

import com.tomato.app.models.Restaurant;

public class RestaurantManager {
	
	private List<Restaurant> restaurants = new ArrayList<>();
	private static RestaurantManager instance = null;
	
	private RestaurantManager() {
		// private constructor
	}
	
	
	public static RestaurantManager getInstance() {
		if(instance == null) {
			synchronized (RestaurantManager.class) {
				if(instance == null) {
					instance = new RestaurantManager();
				}
			}
		}
		
		return instance;
	}
	
	
	public void addRestaurant(Restaurant restaurant) {
		this.restaurants.add(restaurant);
	}
	
	
	public List<Restaurant> serchByLocation(String loc){
		List<Restaurant> result = new ArrayList<>();
		loc = loc.toLowerCase(); 
		
		for(Restaurant res : this.restaurants) {
			if(res.getLocation().toLowerCase().equals(loc)) {
				result.add(res);
			}
		}
		
		return result;
	}

}
