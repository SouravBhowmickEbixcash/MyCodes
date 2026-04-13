package com.example.template;

public class Ladder extends BoardEntity{

	public Ladder(int start, int end) {
		super(start, end);
		if(start >= end) {
			throw new IllegalArgumentException("Ladder's start should be below its end!!");
		}
	}

}
