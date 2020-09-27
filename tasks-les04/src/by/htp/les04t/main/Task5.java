package by.htp.les04t.main;

public class Task5 {

	public static void main(String[] args) {

		int n = 8;

		int[][] mas = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (n - i - 1 == j) {

					mas[i][j] = i + 1;
					System.out.print(mas[i][j] + " ");

				} else {

					mas[i][j] = 0;
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
