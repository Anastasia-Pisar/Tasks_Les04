package by.htp.les04t.main;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {

		int m = 4;
		int n = 4;

		int[][] mas = new int[m][n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if ((i % 2 == 0) || (i == 0)) {

					System.out.print(mas[i][mas[0].length - 1 - j] + " ");

				} else {

					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
