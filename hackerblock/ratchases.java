package hackerblock;

import java.util.Scanner;

public class ratchases {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();  
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		if (!findPath(arr, n, m)) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static boolean findPath(char[][] maze, int n, int m) {
		int path[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				path[i][j] = 0;
			}

		}

		return findpath(maze, n, m, 0, 0, path);

	}

	public static boolean findpath(char[][] maze, int n, int m, int x, int y, int[][] path) {

		if (x < 0 || x >= n || y < 0 || y >= m) {// this for if we get outside the matrix
			return false;
		}

		if (x == n - 1 && y == m - 1) {// this for reaching the end cell
			path[x][y] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(path[i][j] + " ");
				}
				System.out.println();
			}

			return true;
		}

		if (maze[x][y] == 'X' || path[x][y] == 1) {// if zero occurs then move back ya phir agr koi path hum follow kr
													// chuke h toh usspe p bhi nhi jaa sakte hum
			return false;
		}

		path[x][y] = 1;// yeh isliye likha h matlb ki pichle pe hum phoch chuke h , ab agle ke liye
						// check kr rahe h
		// right
		if (findpath(maze, n, m, x, y + 1, path)) {
			path[x][y] = 0;
			return true;
		}

		// left
		if (findpath(maze, n, m, x, y - 1, path)) {
			path[x][y] = 0;
			return true;
		}

		// top
		if (findpath(maze, n, m, x - 1, y, path)) {
			path[x][y] = 0;
			return true;
		}

		// down
		if (findpath(maze, n, m, x + 1, y, path)) {
			path[x][y] = 0;
			return true;
		}
		path[x][y] = 0;
		return false;

	}
}