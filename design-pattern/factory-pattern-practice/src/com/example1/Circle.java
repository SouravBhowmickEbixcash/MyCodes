package com.example1;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public void describe() {
		System.out.printf("Circle with area: %.2f%n", area());
	}
	
}
