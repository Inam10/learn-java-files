package class8;

import java.util.Scanner;

public class ageForVote {
	
	public static int verification(int a ) {
		if(a > 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible");
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println("Enter your age here : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int print = verification(n);
		System.out.println(print);
		
	}

}
