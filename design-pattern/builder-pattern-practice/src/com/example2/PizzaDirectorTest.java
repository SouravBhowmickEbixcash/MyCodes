package com.example2;

public class PizzaDirectorTest {

	public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        Pizza margherita = director.buildMargherita("medium");
        Pizza pepperoni = director.buildPepperoni("large");
        Pizza veggie = director.buildVeggie("small");

        Pizza custom = new Pizza.Builder("large")
                .crust("stuffed")
                .sauce("bbq")
                .cheese("cheddar")
                .toppings("chicken")
                .toppings("bacon")
                .toppings("jalapenos")
                .build();

        System.out.println(margherita);
        System.out.println(pepperoni);
        System.out.println(veggie);
        System.out.println(custom);

	}

}
