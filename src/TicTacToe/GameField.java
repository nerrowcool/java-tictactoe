package TicTacToe;

import TicTacToe.User;

import java.util.Scanner;

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
		Scanner scanner2 = new Scanner(System.in);
		
		while (!Check.win && User.Round < 9) {
			Field();
			
			Loop:
				do {
					User.again_c = true;
					
					User.Input();
				
					User.Input_out_of_range();
					if (!User.range_c) {
						continue Loop;
					}
						
					User.Input_occupied(Draw);
					if (!User.occ_c) {
						continue Loop;
					}
					
					User.Input_again();
					
				} while (User.again_c);

			Draw[User.pos[1] - 1][User.pos[0] - 1] = sign[User.Round % 2];
			User.Round++;
			
			Check.Win(Draw);
			if (Check.win) {
				Field();
				System.out.print("Player " + User.userID[(User.Round - 1) % 2] + " wins!");
			} else if (User.Round == 9) {
				Field();
				System.out.println("Draw!");
			}
		}
		scanner2.close();
	}
}