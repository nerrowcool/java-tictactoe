package TicTacToe;

public class Check {
	public static boolean win;
	
	public static boolean Range(int R) {
			if (R < 4 && R > 0) {
				return true;
			} else {
				return false;
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
			if (W[0][0] == W[1][1] && W[1][1] == W[2][2]) {
				win = true;
			}
			if (W[0][2] == W[1][1] && W[1][1] == W[2][0]) {
				win=true;
			}
			if (win != true) {
				for (int V = 0; V < 3; V++) {
					if (W[V][0] == W[V][1]  && W[V][1]== W[V][2]) {
						win = true;
						break;
					}
					if (W[0][V] == W[1][V] && W[1][V] == W[2][V]) {
						win = true;
						break;
					}
				}
			}
		}
	}
}