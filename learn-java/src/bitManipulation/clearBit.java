package bitManipulation;

public class clearBit {

	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int bitMask = 1<<pos;
		int noBitMask = ~(bitMask);
		
		int newNumber = noBitMask & n;
		System.out.println(newNumber);

	}

}
