package com.tomato.app;

import java.util.List;

import com.tomato.app.factories.NowOrderFactory;
import com.tomato.app.factories.OrderFactory;
import com.tomato.app.factories.ScheduledOrderFactory;
import com.tomato.app.managers.OrderManager;
import com.tomato.app.managers.RestaurantManager;
import com.tomato.app.models.Cart;
import com.tomato.app.models.MenuItem;
import com.tomato.app.models.Order;
import com.tomato.app.models.Restaurant;
import com.tomato.app.models.User;
import com.tomato.app.services.NotificationService;
import com.tomato.app.strategies.PaymentStrategy;

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
    
    
    public Order checkoutNow(User user, String orderType, PaymentStrategy paymentStrategy) {
    	return checkout(user, orderType, paymentStrategy, new NowOrderFactory());
    }
    
    
    public Order checkoutScheduled(User user, String orderType, PaymentStrategy paymentStrategy, String scheduleTime) {
    	return checkout(user, orderType, paymentStrategy, new ScheduledOrderFactory(scheduleTime));
    }
    
    
    private Order checkout(User user, String orderType, PaymentStrategy paymentStrategy, OrderFactory orderFactory) {
    	if(user.getCart() == null) return null;
    	
    	Cart cart = user.getCart();
    	Restaurant restaurant = cart.getRestaurant();
    	List<MenuItem> menuItems = cart.getItems();
    	double cost = cart.getTotalCost();
    	
    	Order order = orderFactory.createOrder(user, cart, restaurant, menuItems, paymentStrategy, cost, orderType);
    	OrderManager.getInstance().addOrder(order);
    	
    	return order;
    }
    
    
    public void payForOrder(User user, Order order) {
    	boolean isPayed = order.processPayment();
    	
    	if(isPayed) {
    		 NotificationService.notify(order);
    		 user.getCart().clear();
    	}
    }
    
    
    public void printUserCart(User user) {
        System.out.println("Items in cart:");
        System.out.println("------------------------------------");
        for (MenuItem item : user.getCart().getItems()) {
            System.out.println(item.getCode() + " : " + item.getName() + " : ₹" + item.getPrice());
        }
        System.out.println("------------------------------------");
        System.out.println("Grand total : ₹" + user.getCart().getTotalCost());
    }
}
