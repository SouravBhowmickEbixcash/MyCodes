package com.example1;

public class TriangleCreator extends ShapeCreator{

	@Override
	public Shape create() {
		return new Triangle(3, 8);
	}
	
}
