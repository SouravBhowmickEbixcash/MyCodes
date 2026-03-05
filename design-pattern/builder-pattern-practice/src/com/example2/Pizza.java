package com.example2;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
    private final String size;
    private final String crust;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;
    
    
    private Pizza(Builder builder) {
    	this.size = builder.size;
    	this.crust = builder.crust;
    	this.sauce = builder .sauce;
    	this.cheese = builder.cheese;
    	this.toppings = builder.toppings;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Pizza { size - " + size + ", crust - " + crust + ", sauce - " + sauce + ", cheese - "+ cheese + ", toppings - [ ");
    	for(String s : toppings) {
    		sb.append(s + ", ");
    	}
    	
    	sb.deleteCharAt(sb.length()-2);
    	sb.append("] }");
    	
    	return sb.toString();
    }
    
    public static class Builder{
        private String size;
        private String crust;
        private String sauce;
        private String cheese;
        private List<String> toppings;
        
        public Builder(String size) {
        	this.size = size;
        	this.crust = "regular";
        	this.sauce = "tomato";
        	this.cheese = "mozzerella";
        	this.toppings = new ArrayList<>();
        }
        
        public Builder crust(String crust) {
        	this.crust = crust;
        	return this;
        }
        
        public Builder sauce(String sauce) {
        	this.sauce = sauce;
        	return this;
        }
        
        public Builder cheese (String cheese) {
        	this.cheese = cheese;
        	return this;
        }
        
        public Builder toppings(String toppings) {
        	this.toppings.add(toppings);
        	return this;
        }
        
        public Pizza build() {
        	return new Pizza(this);
        }
    }
}
