package lesson8.exercise_4;

import java.util.*;

@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		/*
		List list1 = Arrays.asList("A", "B", "C");
		List list2 = Arrays.asList("W", "X", "Y");
		List[] listOfLists = {list1, list2};
		System.out.println(Arrays.toString(listOfLists));
		*/
		
		List<String> list1=new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		List<String> list2=new ArrayList<>();
		list2.add("W");
		list2.add("X");
		list2.add("Y");
		List<List<String>> stringList=new ArrayList<List<String>>();
		stringList.add(list1);
		stringList.add(list2);
		System.out.println(stringList);
		
	}
}
    //////Output
    //[[A, B, C], [W, X, Y]]



