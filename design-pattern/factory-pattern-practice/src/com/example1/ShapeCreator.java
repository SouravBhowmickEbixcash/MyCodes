package com.example1;

public abstract class ShapeCreator {
	
	public abstract Shape create();
	
	public void describe() {
		Shape shape = create();
		shape.describe();
	}

}
