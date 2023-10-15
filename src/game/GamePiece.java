package game;

import java.util.Objects;

import boardgame.Board;
import boardgame.Piece;

public class GamePiece extends Piece {	
	
	private PieceName pieceName;

	public GamePiece(Board board, PieceName pieceName) {
		super(board);	
		this.pieceName = pieceName;
	}
	
	public PieceName getPieceName() {
		return pieceName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pieceName);
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
		return pieceName == other.pieceName;
	}

}
