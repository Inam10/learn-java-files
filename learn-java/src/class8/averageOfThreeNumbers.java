package class8;
import java.util.Scanner;
public class averageOfThreeNumbers {
	
	public static int averageNumbers(int a , int b , int c) {
		int average = (a+b+c) /3;
		return average;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter your three numbers for Average : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int averageNums = averageNumbers(a , b , c);
		System.out.println(averageNums);
		
	}

}
