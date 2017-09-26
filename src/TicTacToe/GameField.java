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
			
			Loop:
			do {
				User.Input();
				System.out.println("input = " + User.input);
			
				User.Input_out_of_range();
				if (!User.range_c) {
					continue Loop;
				}
					
				User.Input_occupied(Draw);
				if (!User.occ_c) {
					continue Loop;
				}
			} while (!User.range_c || !User.occ_c);

				
/*			User.range_c = false;
			do {
				User.Input_out_of_range();
			} while (!User.range_c);
			
			User.occ_c = false;
			do {
				User.Input_occupied(Draw);
			} while (!User.occ_c);
*/			
			User.Input_again();
			
			Draw[User.pos[1] - 1][User.pos[0] - 1] = sign[User.Round % 2];
			User.Round++;
			Check.Win(Draw);
//			}
			if (Check.win ) {
				Field();
				System.out.print("Player " + User.userID[(User.Round - 1) % 2] + " wins!");
			} else if (User.Round == 10){
				Field();
				System.out.println("Draw!");
			} else {
				System.out.println("Bug!!!!");
			}
		}
	}
}