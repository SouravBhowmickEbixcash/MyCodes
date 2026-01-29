package com.example.shapes;

import java.util.Objects;

import com.example.inter.Prototype;

public abstract class Shape implements Prototype{
	
	protected int x;
	protected int y;
	protected String color;
	
	public Shape() {
		
	}
	
	
	public Shape(Shape target) {
		if(target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		} 
	}


	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape)){
			return false;
		}
		Shape other = (Shape) obj;
		return Objects.equals(color, other.color) && x == other.x && y == other.y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
