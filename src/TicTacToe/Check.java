package TicTacToe;

class Check {
	boolean win, occ_c, range_c;
	
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
			if (!win) {
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
		if (A > 3 || A < 0 || B > 3 || B < 0) {
			System.out.println("*****Out of Range*****");
			range_c = false;
		} else {
			range_c = true;
		}
	}
	
	void Input_occupied(char B) {
		occ_c = false;
		if (B != ' ') {
			System.out.println("*****Occupied*****");
			occ_c = false;
		} else {
			occ_c = true;
		}
	}
}