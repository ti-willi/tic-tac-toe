package game.pieces;

import boardgame.Board;
import game.GamePiece;

public class PlayerO extends GamePiece {

	public PlayerO(Board board) {
		super(board);
	}
	
	@Override
	public String toString() {
		return "O";
	}

}
