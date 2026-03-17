package com.examples3;

public abstract class Widget {
	
	protected Theme theme;
	
	public Widget(Theme theme) {
		this.theme = theme;
	}
	
	public abstract void render();

}
