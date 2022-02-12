package prog5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {

		String[] testStrings = { "Mazed", "sazed", "Nayem", "Komol", "hiron","Bikrom","Abir" };

		StringSort stringObj = new StringSort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		stringObj.stringSort(testStrings);
		System.out.println(Arrays.toString(testStrings));

	}

}
