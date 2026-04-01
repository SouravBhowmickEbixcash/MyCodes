package com.example.core_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.example.data_classes.Board;
import com.example.data_classes.GameStatus;
import com.example.data_classes.Player;
import com.example.data_classes.Symbol;
import com.example.exception.InvalidMoveException;
import com.example.observers.GameObserver;
import com.example.strategies.ColumnWinningStrategy;
import com.example.strategies.DiagonalWinningStrategy;
import com.example.strategies.RowWinningStrategy;
import com.example.strategies.WinningStrategy;

public class Game {
	private final Board board;
	private final Player[] players;
	private int currentPlayerIndex;
	private GameStatus gameStatus;
	private final List<WinningStrategy> winningStrategies;
	private final List<GameObserver> observers;
	
	
	public Game (Player p1, Player p2, int size) {
		this.board = new Board(size);
		this.players = new Player[] {p1, p2};
		this.currentPlayerIndex = 0;
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.winningStrategies = initializeStrategies();
		this.observers = new CopyOnWriteArrayList<>();
	} 
	
	
	private List<WinningStrategy> initializeStrategies(){
		List<WinningStrategy> strategies = new ArrayList<>();
		strategies.add(new RowWinningStrategy());
		strategies.add(new ColumnWinningStrategy());
		strategies.add(new DiagonalWinningStrategy());
		
		return strategies;
	}
	
	
	public synchronized void makeMove(int row, int col) {
		// check if game is already over
		if(gameStatus != GameStatus.IN_PROGRESS) {
			throw new InvalidMoveException("Game is already over!");
		}
		
		// Validate the move
		if(!board.isCellEmpty(row, col)) {
			throw new InvalidMoveException("Cell ("+ row + ","+ col + ") already occupied!");
		}
		
		// Place the symbol
		Player currentPlayer = players[currentPlayerIndex];
		board.placeSymbol(row, col, currentPlayer.getSymbol());
		
		// Check for win
		if(checkWin(row, col, currentPlayer.getSymbol())) {
			gameStatus = currentPlayer.getSymbol() == Symbol.X ? GameStatus.WINNER_X : GameStatus.WINNER_O;
			notifyObservers();
			return;
		}
		
		// Check for draw
		if(board.isFull()) {
			gameStatus = GameStatus.DRAW;
			notifyObservers();
			return;
		}
		
		//Switch to next player
		currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;
	}
	
	private boolean checkWin(int row, int col, Symbol symbol) {
		for(WinningStrategy strategy : winningStrategies) {
			if(strategy.checkWin(board, row, col, symbol)) {
				return true;
			}
		}
		return false;
	}
	
	
	public void addObserver(GameObserver observer) {
		this.observers.add(observer);
	}
	
	
	public void notifyObservers() {
		for(GameObserver observer : observers) {
			observer.update(this);
		}
	}
	
	
	public Board getBoard() {
		return this.board;
	}
	
	
	public Player getPlayer() {
		return this.players[currentPlayerIndex];
	}
	
	public GameStatus getStatus() {
		return this.gameStatus;
	}
	
	
	public Player getWinner() {
		if(gameStatus == GameStatus.WINNER_X) {
			return players[0].getSymbol() == Symbol.X ? players[0] : players[1];
		}else if(gameStatus == GameStatus.WINNER_O) {
			return players[0].getSymbol() == Symbol.O ? players[0] : players[1];
		}else {
			return null;
		}
	}
	
    public void printBoard() {
        board.printBoard();
    }
	
}
