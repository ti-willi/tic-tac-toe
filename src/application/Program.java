package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.BoardException;
import game.GameException;
import game.GamePlay;
import game.GamePosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GamePlay gamePlay = new GamePlay();
		
		while(!gamePlay.getWinner()) {
			try {
				
				UI.printGame(gamePlay);
				
				System.out.print("Position: ");
				GamePosition target = UI.readGamePosition(sc);
				
				gamePlay.performGameMove(target);
				
			}
			catch (GameException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (BoardException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		UI.printGame(gamePlay);
		
	}

}
