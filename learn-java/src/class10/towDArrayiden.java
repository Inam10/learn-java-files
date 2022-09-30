package class10;

import java.util.Scanner;

public class towDArrayiden {

	public static void main(String[] args) {
		System.out.println("Enter your column and row numbers : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int numbers[][] = new int [row][col];
		
		System.out.println("Enter your array with row and colum :");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				numbers[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter your x value :");
		int x = sc.nextInt();
		for ( int i = 0; i<row; i++) {
			for (int j = 0 ; j<col ; j++) {
				if(numbers[i][j]==x) {
					System.out.println("x found location at " + i + " and  y found location at " + j );
				}
			}
		}
		
	}

}
