package hackerblock;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		int soduko[][] = new int[N][N];

		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				soduko[i][j] = scn.nextInt();

		SodukoSolver(soduko, 0, 0);
//		for (int i = 0; i < soduko.length; ++i) {
//			for (int j = 0; j < soduko[0].length; ++j) {
//				System.out.print(soduko[i][j] + " ");
//
//			}
//			System.out.println();
//		}

		

	}
	public static void SodukoSolver(int soduko[][], int row, int col) {
		// BASE CASE
		if (col == soduko.length) {
			SodukoSolver(soduko, row + 1, 0);
			return;
		}
		if (row == soduko.length) {
			for (int[] val : soduko) {
				for (int val1 : val) {
					System.out.print(val1 + " ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		// SELF WORK
		int x = 1;

		if (soduko[row][col] == 0) {
			while (x <= 9) {
				if (isItSafe(soduko, row, col, x) == true) {
					soduko[row][col] = x;
					SodukoSolver(soduko, row, col + 1);
					soduko[row][col] = 0;
				}
				x++;
			}
		} else {
			SodukoSolver(soduko, row, col + 1);
		}
	}

	public static boolean isItSafe(int[][] soduko, int row, int col, int x) {
		// IN ROW
		for (int i = 0; i < soduko.length; i++) {
			if (soduko[row][i] == x)
				return false;
		}

		// IN COL
		for (int i = 0; i < soduko.length; i++) {
			if (soduko[i][col] == x)
				return false;
		}

		// IN GRID
		int i = row, j = col;
		int gridRow = i - i % 3;
		int gridCol = j - j % 3;

		for (i = gridRow; i < gridRow + 3; i++) {
			for (j = gridCol; j < gridCol + 3; j++) {
				if (soduko[i][j] == x)
					return false;
			}
		}

		// IF NOTHING HAPPENS
		return true;
	}


}
