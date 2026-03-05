package com.example2;

public class PizzaDirector {
    public Pizza buildMargherita(String size) {
        // TODO: Build with regular crust, tomato sauce, mozzarella, basil topping
    	Pizza pizza = new Pizza.Builder(size)
    			.crust("regular")
    			.sauce("tomato")
    			.cheese("mozzarella")
    			.toppings("basil")
    			.build();
    	
        return pizza;
    }

    public Pizza buildPepperoni(String size) {
        // TODO: Build with thin crust, tomato sauce, mozzarella, pepperoni + olives
    	Pizza pizza = new Pizza.Builder(size)
    			.crust("thin")
    			.sauce("tomato")
    			.cheese("mozzarella")
    			.toppings("pepperoni")
    			.toppings("olives")
    			.build();
    	
        return pizza;
    }

    public Pizza buildVeggie(String size) {
        // TODO: Build with whole wheat crust, pesto sauce, gouda, mushrooms + peppers + onions + olives
    	Pizza pizza = new Pizza.Builder(size)
    			.crust("wheat")
    			.sauce("pesto")
    			.cheese("gouda")
    			.toppings("mushrooms")
    			.toppings("peppers")
    			.toppings("onions")
    			.toppings("olives")
    			.build();
    	
        return pizza;
    }
}
