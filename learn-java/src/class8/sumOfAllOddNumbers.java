package class8;

import java.util.Scanner;

public class sumOfAllOddNumbers {
	
	public static int sumOfOddNum(int a) {
		int num = (2*a-1);
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sumOfOddNum(n);
		System.out.println(sum);

	}

}
