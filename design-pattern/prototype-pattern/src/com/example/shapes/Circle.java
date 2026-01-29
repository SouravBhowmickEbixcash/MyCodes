package com.example.shapes;


public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
		
	}
	
	
	public Circle(Circle target) {
		super(target);
		if(target != null) {
			this.radius = target.radius;
		}
	}
	

	@Override
	public Shape cloneObject() {
		return new Circle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)) {
			return false;
		}
		Circle other = (Circle) obj;
		super.equals(other);
		return radius == other.radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

	
}
