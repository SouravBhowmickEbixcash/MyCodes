package com.example.template;

public class Snake extends BoardEntity{
	
	public Snake(int start, int end) {
		super(start, end);
		if(start <= end) {
			throw new IllegalArgumentException("Snake's head must be at a higher position then the snake's tail!!");
		}
	}
}
