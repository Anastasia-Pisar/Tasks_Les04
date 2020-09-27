package by.htp.les04t.main;

public class Task1 {

	public static void main(String[] args) {
		
		int[][] mas = {{ 1, 3, 8, 5 },
			       { 2, 9, 3, 4 },
			       { 1, 3, 9, 7 },
			       { 6, 5, 8, 7 }};
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				if(i == j) {
					
					System.out.print(mas[i][j] + ", ");
			        }
			}
		}
	}	
}
