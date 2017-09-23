package TicTacToe;

import java.util.Scanner;
import java.util.InputMismatchException;

public class User {
	public static int[] pos = {'0', '0'};
	public static int input;
	public static int Round = 0, userID = (Round % 2 + 1);
	public static char[] signUser = {'O', 'X'};
	public static char[] xy = {'x', 'y'};
	public static  Scanner scanner =new Scanner(System.in);
	
	public void Input() {
		for (input = 0; input < 2; input++) {
			System.out.println("User " + userID + " please enter the " + xy[input] + " position :");
			try {
				pos[input] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You are not inputing a number !");
				break;
			}
		}
	}
}