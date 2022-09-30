package class8;

import java.util.Scanner;

public class radiusOfCircle {
	public static double radiucOfCircle (int r) {
		double circum = 2*(3.14)*r;
		return circum;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter a radius of circle : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double cirumference = radiucOfCircle(r);
		System.out.println(cirumference);
		
		

	}

}
