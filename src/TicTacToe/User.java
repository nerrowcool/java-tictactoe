package TicTacToe;

import java.util.Scanner;
import java.util.InputMismatchException;
import TicTacToe.Check;

public class User {
	
	public static int input, Round = 0;
	public static int[] pos = {0, 0}, userID = {1, 2};
	public static char[] xy = {'x', 'y'};
	public static String clear;
	public static  Scanner scanner =new Scanner(System.in), scanner2 = new Scanner(System.in);
	
	public static void Input() {
		for (input = 0; input < 2; input++) {
			System.out.println("User " + userID[Round % 2] + " please enter the " + xy[input ] + " coordinate :");
			try {
				pos[input] = scanner.nextInt();
				System.out.println(pos[input]);
				if (!Check.Range(pos[input])) {
					System.out.println("Out of Range!");
					Input();
				}
			} catch (InputMismatchException e) {
				System.out.println("You are not inputing a integer!");
				break;
			}
		}
	}
	public static void Input_again() {
		System.out.println("Do you want to input again? (Y/N)");
		clear = scanner2.nextLine();
		System.out.println(clear.toUpperCase().equals("Y"));
		while (clear.toUpperCase().equals("Y")) {
			Input();
		}
	}
}