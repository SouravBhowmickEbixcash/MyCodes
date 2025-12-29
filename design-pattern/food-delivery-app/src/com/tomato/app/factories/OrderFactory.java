package com.tomato.app.factories;

import java.util.List;

import com.tomato.app.models.Cart;
import com.tomato.app.models.MenuItem;
import com.tomato.app.models.Order;
import com.tomato.app.models.Restaurant;
import com.tomato.app.models.User;
import com.tomato.app.strategies.PaymentStrategy;

public interface OrderFactory {
	
	Order createOrder (User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems, PaymentStrategy paymentStrategy, double totalCost, String orderType);

}
