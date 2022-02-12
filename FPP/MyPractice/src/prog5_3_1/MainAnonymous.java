package prog5_3_1;

import java.util.Arrays;

public class MainAnonymous {
	public static void main(String[] args) {
		String[] testStrings = { "Mazed", "sazed", "Nayem", "Komol", "hiron","Bikrom","Abir" };
		StringSort ss = new StringSort(new StringLengthComparator(true) {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return ascending ? (o1.length() - o2.length())   :
					(o2.length() - o1.length());
			}
		});
		ss.stringSort(testStrings);
		System.out.println(Arrays.asList(testStrings));
	}
}
