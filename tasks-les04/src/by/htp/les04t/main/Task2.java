package by.htp.les04t.main;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		
		int k = 3;
		int p = 5;
		
		int[][] mas = new int [4][6];
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++ ){
				
				mas[i][j] = rand.nextInt(10);
				
				System.out.print(mas[i][j] + " "); 
			}
			System.out.println( );
		}
		System.out.println( );		
		System.out.println("k-ая строка матрицы: ");
		System.out.println( );
		
		for(int i = k-1; i < mas.length - 1; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				System.out.print(mas[i][j] + " " );
			}
			
			System.out.println( );
		}
		System.out.println( );
		System.out.println("p-ый столбец матрицы: ");
		System.out.println( );
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = p-1; j < mas[i].length - 1; j++) {
				
				System.out.println(mas [i][j] + " " );
			}
		}
	}
}
