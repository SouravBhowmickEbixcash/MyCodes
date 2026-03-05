package com.example1;

public class CircleCreator extends ShapeCreator{

	@Override
	public Shape create() {
		return new Circle(5);
	}

}
