package game;

import boardgame.Position;

public class GamePosition {
	
	private char column;
	private int row;
	
	public GamePosition(char column, int row) {
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(3 - row, column - 'a');
	}
	
	

	
	
	

}
