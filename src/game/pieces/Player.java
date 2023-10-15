package game.pieces;

import boardgame.Board;
import game.PieceName;
import game.GamePiece;

public class Player extends GamePiece {

	public Player(Board board, PieceName pieceName) {
		super(board, pieceName);
	}
	
	@Override
	public String toString() {
		if (getPieceName() == PieceName.X) {
			return "X";
		}
		else {
			return "O";
		}
	}



}
