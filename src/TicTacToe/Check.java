package TicTacToe;

public class Check {
	public static boolean Avalible;
	
	public boolean Range() {
			if (User.pos[User.input] > 3 || User.pos[User.input] < 1) {
				return false;
			} else {
				return true;
			}
	}
	
	public boolean Avalible() {
		if (GameField.Draw[User.pos[0]][User.pos[1]] = ' ') {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean Valid() {
		
	}
}