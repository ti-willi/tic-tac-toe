package game;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import game.pieces.PlayerO;
import game.pieces.PlayerX;

public class GamePlay {
	
	private Board board;
	private int turn;
	
	public GamePlay() {
		board = new Board(3, 3);
		turn = 1;
		
	}
	
	public int getTurn() {
		return turn;
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
	
	public GamePiece performGameMove(GamePosition targetPosition) {
		Position target = targetPosition.toPosition();
		Piece targetPiece = makeMove(target);
		return (GamePiece) targetPiece;
	}
	
	
	private Piece makeMove(Position target) {
		GamePiece p = new PlayerX(board);
		
		if (turn % 2 == 0) {
			p = new PlayerO(board);
		}
		
		board.placePiece(p, target);
		nextTurn();
		
		return p;
	}
	
	private void nextTurn() {
		turn++;
	}
	
	
	
}
