package com.example.demo;

import java.util.Arrays;
import java.util.List;

import com.example.core_classes.Game;
import com.example.entity.Dice;
import com.example.template.BoardEntity;
import com.example.template.Ladder;
import com.example.template.Snake;

public class SnakeAndLadderDemo {

	public static void main(String[] args) {
		List<BoardEntity> boardEntities = List.of(
	            new Snake(17, 7),
	            new Snake(54, 34),
	            new Snake(62, 19),
	            new Snake(98, 79),
	            new Ladder(3, 38),
	            new Ladder(24, 33),
	            new Ladder(42, 93),
	            new Ladder(72, 84)
	        );

	        List<String> players = Arrays.asList("Alice", "Bob", "Charlie");

	        Game game = Game.builder()
	            .board(100, boardEntities)
	            .players(players)
	            .dice(new Dice(1, 6))
	            .build();

	        game.play();

	}

}
