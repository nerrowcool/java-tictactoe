package TicTacToe;

class Check {
	boolean win, occ_c, range_c;
	
	boolean Range(int R) {
			if (R < 4 && R > 0) {
				return true;
			} else {
				return false;
			}
	}
	
	boolean Avalible(char A) {
		if (A == ' ') {
			return true;
		} else {
			return false;
		}
	}
	
	void Win(int R, char[][] W) {
		if (R > 4) {
			if (W[0][0] != ' ' && W[0][0] == W[1][1] && W[1][1] == W[2][2]) {
				//System.out.println("case 1");
				win = true;
			}
			if (W[0][2] != ' ' && W[0][2] == W[1][1] && W[1][1] == W[2][0]) {
				//System.out.println("case 2");
				win=true;
			}
			if (win != true) {
				for (int V = 0; V < 3; V++) {
					if (W[V][0] != ' ' && W[V][0] == W[V][1]  && W[V][1]== W[V][2]) {
						//System.out.println("case 3");
						win = true;
						break;
					}
					if (W[0][V] != ' ' && W[0][V] == W[1][V] && W[1][V] == W[2][V]) {
						//System.out.println("case 4");
						win = true;
						break;
					}
				}
			}
		}
	}
	
	void Input_out_of_range(int A, int B) {
		range_c = false;
		if (!Range(A) || !Range(B)) {
			System.out.println("Out of Range!");
			range_c = false;
		} else {
			range_c = true;
		}
	}
	
	void Input_occupied(char B) {
		occ_c = false;
		if (!Avalible(B)) {
			System.out.println("Occupied!");
			occ_c = false;
		} else {
			occ_c = true;
		}
	}
}