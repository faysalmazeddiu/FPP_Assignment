package prog2_4;

import java.util.Arrays;

public class Prog4 {
	public static void main(String[] args) {
		
		String myString = Data.records;
		
		String[]tokens = myString.split(",|\\:");
		for(int i=0;i<tokens.length;i+=5) {
			System.out.println(tokens[i]);
		}
		
		
		
		
		
		
		
	}
}
