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
import com.tomato.app.utils.TimeUtils;

public class NowOrderFactory implements OrderFactory{

	@Override
	public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
			PaymentStrategy paymentStrategy, double totalCost, String orderType) {
		
		Order order = null;
		if(orderType.equals("pickup")) {
			PickupOrder pickupOrder = new PickupOrder();
			pickupOrder.setRestaurantAddress(restaurant.getLocation());
			order = pickupOrder;
			
		}else if (orderType.equals("delivery")) {
			DeliveryOrder deliveryOrder = new DeliveryOrder();
			deliveryOrder.setUserAddress(user.getAddress());
			order = deliveryOrder;
		}
		
		order.setUser(user);
		order.setRestaurant(restaurant);
		order.setItems(menuItems);
		order.setPaymentStrategy(paymentStrategy);
		order.setTotal(totalCost);
		order.setSchedule(TimeUtils.getCurrentTime());
		return order;
	}

}
