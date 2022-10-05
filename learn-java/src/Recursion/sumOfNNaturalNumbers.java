package Recursion;

import java.util.Scanner;

public class sumOfNNaturalNumbers {
	public static void printSum(int i ,int n , int sum) {
		if(i==n) {
			sum += i;
			System.out.println(sum);
			
			return;
		}
		sum += i;
		printSum(i+1, n, sum);
		System.out.println(i); //Here will print all number which we are adding
		
	}

	public static void main(String[] args) {
		System.out.println("Enter value of highest num which to want sum of it :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		printSum(1,n,0);

	}

}
