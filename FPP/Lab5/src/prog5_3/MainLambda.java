package prog5_3;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {

		String[] testStrings = { "Mazed", "sazed", "Nayem", "Komol", "hiron","Bikrom","Abir" };

		StringSort stringObj = new StringSort((s1, s2) -> s1.length() - s2.length());
		stringObj.stringSort(testStrings);

		System.out.println(Arrays.toString(testStrings));

	}

}
