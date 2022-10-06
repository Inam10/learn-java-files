package Recursion;

import java.util.Scanner;

public class towerOfHanoi {
	public static void tOH(int n, String src, String helper , String dest) {
		if(n == 1) {
			System.out.println("transfer dist " + n + " " + src + " to " +  dest);
			return;
		}
		tOH(n-1, src, dest, helper);
		System.out.println("transfer dist " + n +" "+ src + " to " +  dest);
		tOH(n-1, helper, src, dest);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of dist : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tOH(n, "S", "H", "D");

	}

}
