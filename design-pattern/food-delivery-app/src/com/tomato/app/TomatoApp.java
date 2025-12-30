package com.tomato.app;

import java.util.List;

import com.tomato.app.managers.RestaurantManager;
import com.tomato.app.models.Cart;
import com.tomato.app.models.MenuItem;
import com.tomato.app.models.Restaurant;
import com.tomato.app.models.User;

public class TomatoApp {
	
	
	public TomatoApp () {
		initializeRestaurants();
	}
	
	
    public void initializeRestaurants() {
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenu(new MenuItem("P1", "Chole Bhature", 120));
        restaurant1.addMenu(new MenuItem("P2", "Samosa", 15));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenu(new MenuItem("P1", "Raj Kachori", 80));
        restaurant2.addMenu(new MenuItem("P2", "Pav Bhaji", 100));
        restaurant2.addMenu(new MenuItem("P3", "Dhokla", 50));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant3.addMenu(new MenuItem("P1", "Masala Dosa", 90));
        restaurant3.addMenu(new MenuItem("P2", "Idli Vada", 60));
        restaurant3.addMenu(new MenuItem("P3", "Filter Coffee", 30));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }
    
    
    public List<Restaurant> searchRestaurants(String location){
    	return RestaurantManager.getInstance().serchByLocation(location);
    }
    
    public void selectRestaurant(User user, Restaurant restaurant) {
    	Cart cart = user.getCart();
    	cart.setRestaurant(restaurant);
    }
    
    
    public void addToCart(User user, String itemCode) {
    	Restaurant restaurant = user.getCart().getRestaurant();
    	if(restaurant == null) {
    		System.out.println("Please select a restaurant first.");
    		return;
    	}
    	
    	for(MenuItem menu : restaurant.getMenu()) {
    		if(menu.getCode().equals(itemCode)) {
    			user.getCart().addItem(menu);
    		}
    	}
    }
}
