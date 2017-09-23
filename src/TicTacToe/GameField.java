package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameField {
	public static void main(String[] args) {
		int printField, printTop, printSide;
		boolean end = false;
		char[][] Draw = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '},
		};
		
		while (!end) {
			// print the play field
			for (printField = 0; printField < 3; printField++) {
				for (printTop = 0; printTop < 7; printTop++) {
					System.out.print('-');
				}
				System.out.print("\r\n");
				for (printSide = 0; printSide < 3; printSide++) {
					System.out.print('|');
					System.out.print(Draw[printField][printSide]);
				}
				System.out.print("|\r\n");
			}
			for (printTop = 0; printTop < 7; printTop++) {
				System.out.print('-');
			}
			System.out.print("\r\n");
			
			// user input
			
			Check.Avalible= false;
			while (!Check.Avalible) {
				if (Draw[User.pos[0] - 1][User.pos[1]  - 1] != ' ') {
					for (User.input = 0; User.input < 2; User.input++) {
						System.out.println("User " + User.userID + " please enter the " + User.xy[input] + " position :");
						User.pos[input] = scanner.nextInt();
					}
				} else {
					Draw[User.pos[0] - 1][User.pos[1]  - 1] = User.signUser[User.Round % 2];
					Check.Avalible = true;
				}
			}
		}
		User.scanner.close();
	}
}