package prog7_3;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);
		list1.add(5);
		list1.add(21);
		list1.add(25);
		list2.add(2);
		list2.add(9);
		list2.add(17);
		Merge mergOb = new Merge();
		LinkedList<Integer> list3 = mergOb.recurse(list1, list2);
		if (list3 != null)
			System.out.println(list3);

	}
	public LinkedList<Integer> merge(LinkedList<Integer> listObj1, LinkedList<Integer> listObj2) {
		if (listObj1 == null && listObj2 == null) {
			return null;
		}
		int firstSize = listObj1.size();
		int secondSize = listObj2.size();
		if (listObj1 == null || listObj1.size() < 1) {
			return listObj2;
		}
		if (listObj2 == null || listObj2.size() < 1) {
			return listObj1;
		}

		LinkedList<Integer> merList = new LinkedList<>();
		int l = 0;
		int m = 0;
		while (merList.size() < firstSize + secondSize) {
			int firstValue = Integer.MAX_VALUE;
			int secondValue = Integer.MAX_VALUE;
			if (l < firstSize) {
				firstValue = listObj1.get(l);
			}
			if (m < secondSize) {
				secondValue = listObj2.get(m);
			}
			if (firstValue < secondValue) {
				merList.add(firstValue);
				l++;
			} else {
				merList.add(secondValue);
				m++;
			}
			System.out.printf("i= %d, j= %d, list1 =%d, listObj2 = %d \n", l, m, firstSize, secondSize);
			System.out.println(merList);
		}

		return merList;
	}

	public LinkedList<Integer> recurse(LinkedList<Integer> listObj, LinkedList<Integer> listObj2) {
		LinkedList<Integer> list3 = new LinkedList<>();
		if ((listObj == null && listObj2 == null) || (listObj.isEmpty() && listObj2.isEmpty()))
			return list3;

		if (listObj2.isEmpty()) {
			list3.addAll(listObj);
			return list3;
		}
		if (listObj.isEmpty()) {
			list3.addAll(listObj2);
			return list3;
		}

		int peek1 = listObj.peek();
		int peek2 = listObj2.peek();

		if (peek1 < peek2)
		{
			list3.add(listObj.pop());
		}
			
		else if (peek2 < peek1) {
			list3.add(listObj2.pop());
		}
			
		list3.addAll(recurse(listObj, listObj2));
		return list3;
	}

	
	
}
