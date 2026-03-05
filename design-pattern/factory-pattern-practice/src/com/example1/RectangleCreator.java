package com.example1;

public class RectangleCreator extends ShapeCreator{

	@Override
	public Shape create() {
		return new Rectangle(4, 6);
	}

}
