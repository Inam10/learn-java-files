package class9;

import java.util.Scanner;

public class arrayQue {

	public static void main(String[] args) {
		System.out.println("Enter your size numbers  : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter your Array : ");
		int numbers[] = new int [size];
		for (int i = 0; i<size; i++) {
			numbers[i] = sc.nextInt();
		} 
		System.out.println("Enter your X value : ");
		int x = sc.nextInt();
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == x) {
				System.out.println("x found at index : "+i);
			}
		}
		
		
		

	}

}
