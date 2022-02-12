package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPractice_2 {
	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
	
		List<Integer> list2=new LinkedList<Integer>();
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list1.addAll(list2);
		System.out.println(list1.containsAll(list2));
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
	}
}
