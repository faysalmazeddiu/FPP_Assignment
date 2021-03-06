package prog11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Schur {
	public static void main(String[] args) {

		Schur schur = new Schur();
		List<Integer> testList = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 8);
		List<Integer> remainingList = schur.removeDuplicace(testList);
		System.out.println(remainingList.toString());
		System.out.println(schur.checkForSum(testList, 3));

	}
	
	public List<Integer> removeDuplicace(List<Integer> list) {
		HashMap<Integer, Integer> hashMapObject = new HashMap<Integer, Integer>();
		List<Integer> listObj = new ArrayList<Integer>();
		for (Integer listItem : list) {
			if (hashMapObject.containsKey(listItem)==false) {
				hashMapObject.put(listItem, listItem);
				listObj.add(listItem);
			}
		}
		return listObj;
	}
	
	public boolean checkForSum(List<Integer> list, Integer z) {
		HashMap<Integer, Integer> hashMapObject = new HashMap<Integer, Integer>();

		for (int index = 0; index < list.size(); index++) {
			int value = list.get(index);
			if (hashMapObject.containsKey(z - value)) {
				return true;
			}
				
			else
			{
				hashMapObject.put(value, value);
			}
				
		}
		return false;
	}

	

	

}
