package ForEach;

import java.util.ArrayList;
import java.util.List;



public class ForeachPractice {
	public static void main(String[] args) 
	{
		List<List<Integer>> listOfLists = new ArrayList<>();
		List<Integer> innerList = new ArrayList<>();
		innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        listOfLists.add(innerList);
        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        listOfLists.add(innerList2);
        listOfLists.forEach(list-> list.forEach(x-> System.out.println(x)));
	}
	
}
