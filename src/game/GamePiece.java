package game;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GamePiece other = (GamePiece) obj;
		return color == other.color;
	}

	

}
