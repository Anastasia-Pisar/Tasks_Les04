package by.htp.les04t.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		int[][] mas = new int[6][6];

		matrix(mas);
		print(mas);
		positiveElement(mas);
	}

	public static void matrix(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				mas[i][j] = rand.nextInt(10) % 10 - 5;
			}
		}
	}

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void positiveElement(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if ((i == j) && (mas[i][j] >= 0)) {

					System.out.print(mas[i][j] + ", ");
				}
			}
		}
	}
}
