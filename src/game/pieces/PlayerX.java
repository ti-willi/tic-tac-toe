package game.pieces;

import boardgame.Board;
import game.Color;
import game.GamePiece;

public class PlayerX extends GamePiece {

	public PlayerX(Board board, Color color) {
		super(board, color);
		color = Color.WHITE;
	}
	
	@Override
	public String toString() {
		return "X";
	}

}
