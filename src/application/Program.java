package application;

import java.util.Scanner;

import game.GamePlay;
import game.GamePosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GamePlay gamePlay = new GamePlay();
		
		while(true) {
			UI.printGame(gamePlay);
			
			System.out.print("Position: ");
			GamePosition target = UI.readGamePosition(sc);
			
			gamePlay.performGameMove(target);			
		}
		
		
		
	
		
	}

}
