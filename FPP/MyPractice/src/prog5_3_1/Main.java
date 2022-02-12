package prog5_3_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StringSort ss = new StringSort(new StringLengthComparator(true));

		String[] testStrings = { "Mazed", "sazed", "Nayem", "Komol", "hiron","Bikrom","Abir" };
		ss.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
	}
}
