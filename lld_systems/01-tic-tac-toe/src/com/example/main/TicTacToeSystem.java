package com.example.main;

import com.example.core_classes.Game;
import com.example.data_classes.GameStatus;
import com.example.data_classes.Player;
import com.example.observers.ScoreBoard;

public class TicTacToeSystem {
	
	private static volatile TicTacToeSystem instance;
	private static final Object lock = new Object();
	
	private final ScoreBoard scoreBoard;
	private Game currentGame;
	
	private TicTacToeSystem() {
		this.scoreBoard = new ScoreBoard();
	}
	
	public static TicTacToeSystem getInstance() {
		if(instance == null) {
			synchronized (lock) {
				if(instance == null) {
					instance = new TicTacToeSystem();
				}
			}
		}
		
		return instance;
	}
	
	
	public Game createGame(Player p1, Player p2) {
		currentGame = new Game(p1, p2, 3);
		currentGame.addObserver(scoreBoard);
		System.out.println("New game started: " + p1.getName() +
	            " vs " + p2.getName());
		return currentGame;
	}
	
	public void makeMove(Player player, int row, int col) {
		if(currentGame == null) {
			throw new IllegalStateException("No active game, call create game first!");
		}
		
        System.out.println(player.getName() + " plays at (" + row + ", " + col + ")");
        currentGame.makeMove(row, col);
        currentGame.printBoard();
	}
	
    public GameStatus getGameStatus() {
        if (currentGame == null) {
            throw new IllegalStateException("No active game.");
        }
        return currentGame.getStatus();
    }
    
    
    public void printScoreboard() {
        scoreBoard.printScoreboard();
    }

    // For testing: reset the singleton
    public static void resetInstance() {
        synchronized (lock) {
            instance = null;
        }
    }
}
