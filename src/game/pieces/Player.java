package game.pieces;

import boardgame.Board;
import game.Color;
import game.GamePiece;

public class Player extends GamePiece {

	public Player(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) {
			return "X";
		}
		else {
			return "O";
		}
	}



}
