package Project1;

import java.util.Scanner;

public class TiktocToy {

	static char[][] a = { { ' ', ' ', ' ', }, { ' ', ' ', ' ', }, { ' ', ' ', ' ', } };
	static char player = 'x';

	public static void displayBoard() {
		System.out.println("-----------");
		for (char[] a1 : a) {
			System.out.print("| ");
			for (char a2 : a1) {
				System.out.print(a2+"| ");
			}
			System.out.println( );
			System.out.println("-----------");
		
		}
	}

	public static void main(String... args) {
		boolean status = true;
		Scanner sc = new Scanner(System.in);
		
		while (status) {
			displayBoard();
			System.out.println("Enter a rows:");
			int row = sc.nextInt();
			System.out.println("Enter a col:");
			int col = sc.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || a[row][col] != ' ') {
				System.out.println("Invalid moves");
				System.out.println("play again ");
				continue;
			}
			a[row][col] = player;
			if(isWin()) {
				displayBoard();
				System.out.println("u won the match"+-- player);
				break;
			}
			if(isDraw()) {
				displayBoard();
				System.out.println("Draw the match");
				break;
			}
			player =player == 'x'?'o':'x';
		}
		

		}
		public static  boolean isWin() {
			for(int i =0;i<=2;i++) {
				if(a[i][0]== player && a[i][1]== player &&  a[i][2]== player  ) {
					return true;
				}
			}
			for(int i =0;i<=2;i++) {
				if(a[0][i]== player && a[1][i]== player &&  a[2][i]== player  ) {
					return true;
				}
			}
			if(a[0][0]== player && a[1][1]== player &&  a[2][2]== player  ) {
				return true;
			}
			if(a[0][2]== player && a[1][1]== player &&  a[2][0]== player  ) {
				return true;
			}
			return false;
		
		}
		public static boolean isDraw() {
			for(char[] a1: a) {
				for(char a2: a1) {
					if(a2 == ' ' ) {
					return false;
					}
				}
			}
			return true;
		
	}

}
