package game;

import java.util.ArrayList;
import java.util.List;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import game.pieces.Player;

public class GamePlay {
	
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean winner;

	
	List<Piece> piecesOnTheBoard = new ArrayList<>();
	
	public GamePlay() {
		board = new Board(3, 3);
		turn = 1;	
	}
	
	public int getTurn() {
		return turn;
	}
	
	public Color getCurrentPlayer() {
		return currentPlayer;
	}
	
	public boolean getWinner() {
		return winner;
	}
	
	
	
	public List<Piece> getPiecesOnTheBoard() {
		return piecesOnTheBoard;
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
		checkWinner();
		nextTurn();
		System.out.println();
		System.out.println();
		return (GamePiece) targetPiece;
		
		
		
	}
	
	private Piece makeMove(Position target) {
		GamePiece p = new Player(board, Color.WHITE);
		
		if(turn % 2 == 0) {
			p = new Player(board, Color.YELLOW);
		}
		
		
		board.placePiece(p, target);
		piecesOnTheBoard.add(p);
		currentPlayer = p.getColor();
		
		
		return p;
	}
	
	private void nextTurn() {
		turn++;
	}
	
	private void checkWinner() {
		for (int i = 0; i < board.getRows(); i++) {
			for (int j= 0; j < board.getColumns(); j++) {
				
				// horizontal
				if (board.thereIsAPiece(i, 0) && board.piece(i, 0).equals(board.piece(i, 1)) && board.piece(i, 0).equals(board.piece(i, 2))) {
					winner = true;
				}
				
				// vertical
				if (board.thereIsAPiece(0, j) && board.piece(0, j).equals(board.piece(1, j)) && board.piece(0, j).equals(board.piece(2, j))) {
					winner = true;
				}
				
				// diagonal 1
				if (board.thereIsAPiece(0, 0) && board.piece(0, 0).equals(board.piece(1, 1)) && board.piece(0, 0).equals(board.piece(2, 2))) {
					winner = true;
				}
				
				// diagonal 2
				if (board.thereIsAPiece(0, 2) && board.piece(0, 2).equals(board.piece(1, 1)) && board.piece(0, 2).equals(board.piece(2, 0))) {
					winner = true;
				}
				
			}
		}
	}
		
}
