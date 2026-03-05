package com.example1;

public class Triangle implements Shape{
	
	private double base;
	private double height;
	
	public Triangle (double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return 0.5*base*height;
	}

	@Override
	public void describe() {
		System.out.printf("Triangle with area: %.2f%n", area());
		
	}

}
