package TicTacToe;

import java.util.Scanner;
import java.lang.NumberFormatException;
import TicTacToe.Check;

public class User {
	
	public static int input, Round = 0;
	public static int[] pos = {0, 0}, userID = {1, 2};
	public static char[] xy = {'x', 'y'};
	public static String raw_input, clear;
	public static  Scanner scanner =new Scanner(System.in);
	public static boolean range_c, occ_c;
	
	public static void Input() {
		for (input = 0; input < 2; input++) {
			try {
				System.out.println("Player " + userID[Round % 2] + " please enter the " + xy[input] + " coordinate :");
				raw_input = scanner.nextLine();
				pos[input] = Integer.parseInt(raw_input);
			} catch (NumberFormatException e) {
				System.out.println("You are not inputing a integer!");
				input = -1;
			}
		}
	}
	
	public static void Input_out_of_range() {
		range_c = false;
		if (!Check.Range(pos[input - 1])) {
			System.out.println("Out of Range!");
			range_c = false;
		} else {
			range_c = true;
		}
	}
	
	public static void Input_occupied(char[][] D) {
		occ_c = false;
		if (!Check.Avalible(D[pos[1] - 1][pos[0] - 1])) {
			//System.out.println("This postion is occupied!\npos[1] - 1 is :" + (pos[1] - 1) + "\npos[0] - 1 is :" + (pos[0] - 1));
			occ_c = false;
		} else {
			occ_c = true;
		}
	}
}