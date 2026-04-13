package com.example.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.template.BoardEntity;

public class Board {
	private final int size;
	private final Map<Integer, Integer> snakesAndLadder;
	
	public Board (int size, List<BoardEntity> entities) {
		this.size = size;
		this.snakesAndLadder = new HashMap<>();
		
		for(BoardEntity entity : entities) {
			snakesAndLadder.put(entity.getStart(), entity.getEnd());
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public int getFinalPosition(int position) {
		return snakesAndLadder.getOrDefault(position, position);
	}
}
