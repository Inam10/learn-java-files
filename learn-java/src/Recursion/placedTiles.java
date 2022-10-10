package Recursion;

public class placedTiles {
	
	public static int placeTiles(int n , int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		int verticalPlaced = placeTiles(n-m, m);
		
		int horizentalPlaced = placeTiles(n-1, m);
		
		return verticalPlaced + horizentalPlaced;
	}

	public static void main(String[] args) {
	int n =3 ,m= 3;
	System.out.println(placeTiles(n, m));
		
	}

}
