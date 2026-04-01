package com.example.strategies;

import com.example.data_classes.Board;
import com.example.data_classes.Symbol;

public class DiagonalWinningStrategy implements WinningStrategy{

	@Override
	public boolean checkWin(Board board, int row, int col, Symbol symbol) {
		int size = board.getSize();
		boolean win = true;
		
		for(int i = 0; i < size; i++) {
			if(board.getCell(i, i).getSymbol() != symbol) {
				win = false;
				break;
			}
		}
		
		if(win) return true;
		
		win = true;
		for(int i = 0, j = size-1; i < size && j >= 0; i++, j--) {
			if(board.getCell(i, j).getSymbol() != symbol) {
				win = false;
				break;
			}
		}
		
		return win;
	}
}
