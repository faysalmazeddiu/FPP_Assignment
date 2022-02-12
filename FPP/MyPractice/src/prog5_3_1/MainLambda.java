package prog5_3_1;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args) {
		String[] testStrings = { "Mazed", "sazed", "Nayem", "Komol", "hiron","Bikrom","Abir" };
	    boolean ascending = true;
	    
		StringSort ss = new StringSort((o1, o2) -> ascending?(o1.length() - o2.length())   :
			(o2.length() - o1.length()));
		ss.stringSort(testStrings);
		
		System.out.println(Arrays.asList(testStrings));
	}
}
