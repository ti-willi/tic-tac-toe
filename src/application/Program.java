package application;

import game.GamePlay;

public class Program {

	public static void main(String[] args) {
		
		GamePlay gamePlay = new GamePlay();
		
		UI.printBoard(gamePlay.getPieces());
		
	}

}
