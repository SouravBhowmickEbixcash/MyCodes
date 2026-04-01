package com.example.data_classes;

import com.example.exception.InvalidMoveException;

public class Board {
	private final Cell[][] grid;
	private final int size;
	
	
	public Board(int size) {
		this.grid = new Cell[size][size];
		this.size = size;
		initializeBoard();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isCellEmpty(int row, int col) {
		validatePosition(row, col);
		return grid[row][col].isEmpty();
	}
	
	public boolean isFull() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(grid[i][j].isEmpty()) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void placeSymbol(int row, int col, Symbol symbol) {
		validatePosition(row, col);
		this.grid[row][col].setSymbol(symbol);
	}
	
	private void validatePosition(int row, int col) {
		if(row < 0 || row >= size || col < 0 || col >= size) {
			throw new InvalidMoveException("Position ("+ row + ", " + col + ") is invalid");
		}
	}
	
	private void initializeBoard() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				Cell cell = new Cell();
				grid[i][j] = cell;
			}
		}
	}
	
	
	public Cell getCell(int row, int col) {
		validatePosition(row, col);
		return this.grid[row][col];
	}
	
	
	public void printBoard() {
		System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + grid[i][j].getSymbol().getDisplayChar() + " ");
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("-".repeat(size * 4 - 1));
            }
        }
        System.out.println();
	}
}
