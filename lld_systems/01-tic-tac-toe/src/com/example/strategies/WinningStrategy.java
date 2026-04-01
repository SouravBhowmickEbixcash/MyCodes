package com.example.strategies;

import com.example.data_classes.Board;
import com.example.data_classes.Symbol;

public interface WinningStrategy {
	boolean checkWin(Board board, int row, int col, Symbol symbol);
}
