package game;

import boardgame.Board;
import boardgame.Piece;

public class GamePiece extends Piece {
	
    private Color color;

	public GamePiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}
