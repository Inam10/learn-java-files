package class7;
import java.util.Scanner;
public class productFunction {
	
	public static int productNum(int a , int b) {
		int product = a*b;
		
		return product;
	}

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int product = productNum(a,b);
	 System.out.println(product);

	}

}
