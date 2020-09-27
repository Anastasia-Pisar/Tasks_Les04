package by.htp.les04t.main;

public class Task12 {

	public static void main(String[] args) {

		int m = 7;
		int n = 7;

		int[][] mas = new int[m][n];

		matrix(mas);
	}

	public static void matrix(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (i <= j) {

					mas[i][j] = 1;
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
