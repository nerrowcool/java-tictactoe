package TicTacToe;

import TicTacToe.User;
import TicTacToe.Check;

public class GameField {
	public static char[][] Draw = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '},
		};
	public static void Field() {
		int printField, printTop, printSide;
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
	}
	public static void main(String[] args) {
		char[] sign = {'O', 'X'};
		
		while (!Check.win && User.Round < 10) {
			Field();
			
			// user input
			User.Input();
			User.Input_again();
			while (Check.Avalible(Draw[User.pos[1] - 1][User.pos[0] - 1]) == false) {
				System.out.println("This postion is occupied!");
				User.Input();
				User.Input_again();
			} 
			Draw[User.pos[1] - 1][User.pos[0] - 1] = sign[User.Round % 2];
			User.Round++;
			Check.Win(Draw);
		}
		if (Check.win == true) {
			Field();
			System.out.print("Player " + User.userID[(User.Round - 1) % 2] + " wins!");
		} else {
			Field();
			System.out.println("Draw!");
		}
	}
}