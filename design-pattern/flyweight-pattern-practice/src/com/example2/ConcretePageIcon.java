package com.example2;

public class ConcretePageIcon implements PageIcon{
	private final String iconType;
	private final String color;
	private final int size;
	
	public ConcretePageIcon(String iconType, String color, int size) {
		this.iconType = iconType;
		this.color = color;
		this.size = size;
	}
	
	@Override
	public void display(String url, int x, int y) {
		System.out.println("["+ iconType + ", " + color + ", " + size + "] at " + url + " ("  + x + "," + y + ")");
	}

}
