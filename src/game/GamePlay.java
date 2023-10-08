package game;

import boardgame.Board;
import game.pieces.PlayerO;
import game.pieces.PlayerX;

public class GamePlay {
	
	private Board board;
	
	 
	
	public GamePlay() {
		board = new Board(3, 3);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, GamePiece piece) {
		board.placePiece(piece, new GamePosition(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('b', 2, new PlayerX(board, Color.WHITE));
		placeNewPiece('a', 1, new PlayerX(board, Color.WHITE));
		placeNewPiece('b', 3, new PlayerO(board, Color.YELLOW));
	}
	
}
