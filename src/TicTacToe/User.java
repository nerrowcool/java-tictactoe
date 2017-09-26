package TicTacToe;

import java.util.Scanner;
import java.lang.NumberFormatException;
import TicTacToe.Check;

public class User {
	
	public static int input, Round = 0;
	public static int[] pos = {0, 0}, userID = {1, 2};
	public static char[] xy = {'x', 'y'};
	public static String raw_input, clear;
	public static  Scanner scanner =new Scanner(System.in), scanner2 = new Scanner(System.in);
	public static boolean int_c = false, range_c = false, occ_c = false;
	
	public static void Input() {
		for (input = 0; input < 2; input++) {
//			System.out.println("input = " + input);
			System.out.println("User " + userID[Round % 2] + " please enter the " + xy[input ] + " coordinate :");
/*			do{
				if (scanner.hasNextInt()) {
					pos[input] = scanner.nextInt();
					int_c = true;
				} else {
					System.out.println("Shit i contain a character!");
					
					int_c = false;
				}
			}while (!int_c);
*/			try {
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
			System.out.println(input - 1);
			System.out.println("Out of Range!");
			range_c = false;
//			input = 0;
//			Input();
		} else {
			range_c = true;
		}
	}
	
	public static void Input_occupied(char[][] D) {
		occ_c = false;
		if (!Check.Avalible(D[pos[1] - 1][pos[0] - 1])) {
			System.out.println("This postion is occupied!");
			occ_c = false;
//			input = 0;
//			Input();
		} else {
			occ_c = true;
		}
	}
	
	public static void Input_again() {
		System.out.println("Do you want to input again? (Y/N)");
		clear = scanner2.nextLine();
		//System.out.println(clear.toUpperCase().equals("Y"));
		if (clear.toUpperCase().equals("Y")) {
			Input();
		}
	}
}