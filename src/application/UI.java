package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import game.Color;
import game.GamePiece;
import game.GamePlay;
import game.GamePosition;

public class UI {
	
	public static GamePosition readGamePosition(Scanner sc) {
		try {
			
			String s = sc.nextLine().toLowerCase();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new GamePosition(column, row);
			
		}
		catch (RuntimeException e) {
			throw new InputMismatchException("Error reading GamePosition. Valid values are from a1 to c3.");
		}
	}
	
	public static void printGame(GamePlay gamePlay) {
		printBoard(gamePlay.getPieces());
		
		if (gamePlay.getWinner()) {
			String currentPlayerColor = gamePlay.getCurrentPlayer() == Color.WHITE ? "X" : "O";
			System.out.println("The winner is player " + currentPlayerColor);
		}
		if (gamePlay.getTurn() > 9) {
			System.out.println("There is no winner");
		}
	}
	
	public static void printBoard(GamePiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((3 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c");
	}
	
	public static void printPiece(GamePiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
