package TicTacToe;

import java.util.Scanner;
import java.lang.NumberFormatException;

class User {
	int input, count = 0;
	int[] pos = {0, 0}, userID = {1, 2};
	char[] xy = {'x', 'y'};
	boolean input_again;
	String clear;
	Scanner scanner =new Scanner(System.in), scanner2 =new Scanner(System.in);
	
	void Input() {
		for (input = 0; input < 2; input++) {
			try {
				System.out.println("Player " + userID[count % 2] + " please enter the " + xy[input] + " coordinate :");
				pos[input] = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("*****Not intege*****");
				System.out.println("\n-----Round " + (count + 1) + "-----");
				input = -1;
			}
		}
	}
	
	void Input_again() {
		System.out.println("Do you want to input again? (Y/N)");
		clear = scanner2.nextLine();
		
		if (clear.toUpperCase().equals("Y")) {
			input_again = true;
		} else {
			input_again = false;
		}
	}
}