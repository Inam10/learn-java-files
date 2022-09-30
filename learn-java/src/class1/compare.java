package class1;
import java.util.*;
public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a==b) {
			System.out.println("Equal");
		}else {
			if (a>b) {
				System.out.println("A is greater than b");
			}else{
				System.out.println("A is lesser");
			}
		}
	}

}
