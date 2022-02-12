package Recurrsion;

public class StringReverse {
	public static void main(String[] args) {
		String nameString="Mazed";
		System.out.println(reverseString(nameString));
		//System.out.println(nameString.substring(0,nameString.length()));
		//reverseString(nameString);
	}
	
	static String reverseString(String str) {
		if(str==null || str=="") {
			return str;
		}
		String firstChar =String.valueOf(str.charAt(0));
		return reverseString(str.substring(1))+firstChar;
		
	}
}
