package com.tomato.app.factories;

import java.util.List;

import com.tomato.app.models.Cart;
import com.tomato.app.models.DeliveryOrder;
import com.tomato.app.models.MenuItem;
import com.tomato.app.models.Order;
import com.tomato.app.models.PickupOrder;
import com.tomato.app.models.Restaurant;
import com.tomato.app.models.User;
import com.tomato.app.strategies.PaymentStrategy;

public class ScheduledOrderFactory implements OrderFactory{
	
	private String schedule;
	
	
	public ScheduledOrderFactory (String schedule) {
		this.schedule = schedule;
	}
	
	
	@Override
	public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
			PaymentStrategy paymentStrategy, double totalCost, String orderType) {
		
		Order order = null;
		
		if(orderType.equals("delivery")) {
			DeliveryOrder deliveryOrder = new DeliveryOrder();
			deliveryOrder.setUserAddress(user.getAddress());
			order = deliveryOrder;
			
		}else if(orderType.equals("pickup")) {
			PickupOrder pickupOrder = new PickupOrder();
			pickupOrder.setRestaurantAddress(restaurant.getLocation());
			order = pickupOrder;
			
		}
		
		order.setUser(user);
		order.setItems(menuItems);
		order.setRestaurant(restaurant);
		order.setTotal(totalCost);
		order.setPaymentStrategy(paymentStrategy);
		order.setSchedule(this.schedule);
		return order;
	}

}
