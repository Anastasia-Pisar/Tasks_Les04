package by.htp.les04t.main;

public class Task4 {

	public static void main(String[] args) {

		int n = 4;

		int[][] mas = new int[4][4];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {

					mas[i][j] = j + 1;
					System.out.print(mas[i][j] + " ");

				} else {

					mas[i][j] = n - j;
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
