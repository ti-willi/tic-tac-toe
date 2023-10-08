package game.pieces;

import boardgame.Board;
import game.Color;
import game.GamePiece;

public class PlayerO extends GamePiece {

	public PlayerO(Board board, Color color) {
		super(board, color);
		color = Color.YELLOW;
	}
	
	@Override
	public String toString() {
		return "O";
	}

}
