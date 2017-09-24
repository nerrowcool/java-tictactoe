package TicTacToe;

public class Check {
	public static boolean end;
	
	public static boolean Range(int R) {
			if (R < 4 || R > 0) {
				return false;
			} else {
				return true;
			}
	}
	
	public static boolean Avalible(char A) {
		if (A != ' ') {
			return false;
		} else {
			return true;
		}
	}
	
	public static void Win(char[][] W) {
		if (User.Round > 4) {
			for (int V = 0; V < 3; V++) {
				if (W[V][0] == W[V][1]  && W[V][1]== W[V][2]) {
					end = true;
					break;
				}
				if (W[0][V] == W[1][V] && W[1][V] == W[2][V]) {
					end = true;
					break;
				}
			}
			if (end != true) {
				if (W[0][0] == W[1][1] && W[1][1] == W[2][2]) {
					end = true;
				}
				if (W[0][2] == W[1][1] && W[1][1] == W[2][0]) {
					end=true;
				}
			}
		}
	}
}