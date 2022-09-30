package class8;

import java.util.Scanner;

public class   greaterNumFind {
	public static int greatNum(int a , int b ) {
	
		if (a>b) {
			System.out.println(a + " greater than" + b );
		}
		
		else {
			System.out.println(b + " is greater than " + a);
		}
	
		return 0;
	}

	public static void main(String[] args) {
	System.out.println("Enter two numbers for test :");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int avg = greatNum(a , b);
	System.out.println(avg);
	}

}
