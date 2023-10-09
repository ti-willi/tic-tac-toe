package game.pieces;

import boardgame.Board;
import game.GamePiece;

public class PlayerX extends GamePiece {

	public PlayerX(Board board) {
		super(board);
	}
	
	@Override
	public String toString() {
		return "X";
	}

}
