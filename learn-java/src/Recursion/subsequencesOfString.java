package Recursion;

public class subsequencesOfString {
	
public static void subsequences (String str , int idx , String newString) {
	if(idx == str.length()) {
		System.out.println(newString);
		return;
	}
	
	char currChar = str.charAt(idx);
	
	subsequences(str, idx+1, newString+currChar);
	
	subsequences(str, idx+1, newString);
}

	public static void main(String[] args) {
	
		String str = "abc";
		subsequences(str, 0, "");
	}

}

//lenght power of n of 2 means when your character numbers is 3 then output series is 8
