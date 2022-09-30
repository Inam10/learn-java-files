package class1;
import java.util.*;

public class conditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int age = sc.nextInt();
		
		
		if (age > 18) {
			System.out.println("you are adult");
		}else {
			System.out.println("Not adult");
		}
	}

}
