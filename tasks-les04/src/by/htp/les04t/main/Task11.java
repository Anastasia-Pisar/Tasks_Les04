package by.htp.les04t.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int[] str = new int[10];
		int[][] mas = new int[10][20];

		matrix(str, mas);
	}

	public static void matrix(int[] str, int[][] mas) {

		int quantity;
		int k = 0;

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {

			quantity = 0;

			for (int j = 0; j < 20; j++) {

				mas[i][j] = rand.nextInt(16);
				System.out.printf("%3d", mas[i][j]);

				if (mas[i][j] == 5) {
					quantity = quantity + 1;
				}
			}
			System.out.println();

			if (quantity >= 3) {
				str[k] = i + 1;
				k = k + 1;
			}
		}
		System.out.println();
		System.out.println("Строки, в которых число 5 встречается три и более раз: ");
		System.out.println();

		for (int i = 0; i < k; i++) {

			System.out.printf("%2d", str[i]);
		}
	}
}
