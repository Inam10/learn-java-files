package class4;
import java.util.*;

public class SumNaturalNumners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n =  sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n; i++) {
			
			
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
