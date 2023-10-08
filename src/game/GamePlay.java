package game;

import boardgame.Board;

public class GamePlay {
	
	private Board board;
	
	public GamePlay() {
		board = new Board(3, 3);
	}
	
	public GamePiece[][] getPieces() {
		GamePiece[][] mat = new GamePiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (GamePiece) board.piece(i, j);
			}
		}
		return mat;		
	}
	
}
