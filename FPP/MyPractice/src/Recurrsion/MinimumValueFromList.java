package Recurrsion;

import java.util.LinkedList;
import java.util.List;
public class MinimumValueFromList {
	
	public static void main(String[] args) {
		List<Integer> integerList=new LinkedList<Integer>();
		System.out.println(integerList.size());
		integerList.add(12);
		integerList.add(0);
		integerList.add(34);
		integerList.add(20);
		integerList.add(25);
		integerList.add(1);
		
//		System.out.println(integerList.contains(34));
//		
//		System.out.println(integerList.isEmpty());
//		System.out.println(integerList.get(3));
//		integerList.set(1, 9);
//		System.out.println(integerList);
//		
//		System.out.println(integerList.remove(2));
//		System.out.println(integerList);
		
		System.out.println(findMin(integerList));
	}
	
	 public static int findMin(List<Integer> list) {
		 int min=list.remove(0);
		 if(list.size()==0) {
			 return min;
		 }else {
			 Integer recureValInteger=findMin(list);
			 return (min>recureValInteger)?recureValInteger:min;
		 }
	 }
	
	
}
