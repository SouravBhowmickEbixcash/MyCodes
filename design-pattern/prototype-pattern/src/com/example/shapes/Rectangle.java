package com.example.shapes;

import java.util.Objects;

public class Rectangle extends Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle() {}
	
	public Rectangle(Rectangle target) {
		super(target);
		if(target != null) {
			this.length = target.length;
			this.breadth = target.breadth;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		super.equals(other);
		return breadth == other.breadth && length == other.length;
	}

	@Override
	public Shape cloneObject() {
		return new Rectangle(this);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	

}
