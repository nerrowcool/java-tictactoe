package TicTacToe;

import TicTacToe.User;
import TicTacToe.Check;

public class GameField {
	
	char[][] Draw = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '},
		};
	
	void Field() {
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
		GameField tictactoe = new GameField();
		User player = new User();
		Check condition = new Check();
		char[] sign = {'O', 'X'};
		
		while (!condition.win && player.count < 9) {
			tictactoe.Field();
			
			Loop:
				do {
					player.input_again = true;
					
					player.Input();
				
					condition.Input_out_of_range(player.pos[player.input - 1], player.pos[player.input - 2]);
					if (!condition.range_c) {
						continue Loop;
					}
						
					condition.Input_occupied(tictactoe.Draw[player.pos[1] - 1][player.pos[0] - 1] );
					if (!condition.occ_c) {
						continue Loop;
					}
					
					player.Input_again();
					
				} while (player.input_again);

			tictactoe.Draw[player.pos[1] - 1][player.pos[0] - 1] = sign[player.count % 2];
			player.count++;
			
			condition.Win(player.count, tictactoe.Draw);
			if (condition.win) {
				tictactoe.Field();
				System.out.print("Player " + player.userID[(player.count - 1) % 2] + " wins!");
			} else if (player.count == 9) {
				tictactoe.Field();
				System.out.println("Draw!");
			}
		}
	}
}