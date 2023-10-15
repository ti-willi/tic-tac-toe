package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import game.GamePiece;
import game.GamePlay;
import game.GamePosition;
import game.PieceName;

public class UI {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}	
	
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
		System.out.println();
		
		if (gamePlay.getWinner()) {
			System.out.print("The winner is player " + gamePlay.getCurrentPlayer());
		}
		else if (gamePlay.getTurn() == 10) {
			System.out.println("There is no winner");
		}
		
		else {
			String waitingCurrentPlayer = gamePlay.getCurrentPlayer() == "X" ? "O" : "X";
			System.out.print("Waiting player " + waitingCurrentPlayer + ": ");
		}
	}
	
	public static void printBoard(GamePiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print(ANSI_YELLOW + (3 - i) + " " + ANSI_RESET);
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);				
			}
			System.out.println();
		}
		System.out.println(ANSI_YELLOW + "  a b c" + ANSI_RESET);
	}
	
	public static void printPiece(GamePiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			if (piece.getPieceName() == PieceName.X) {
				System.out.print(ANSI_RED + piece + ANSI_RESET);
			}
			else {
				System.out.print(ANSI_CYAN + piece + ANSI_RESET);
			}
		}
		System.out.print(" ");
	}
	
}
