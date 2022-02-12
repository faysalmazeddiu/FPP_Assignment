package prog10_3.sortroutines;

import prog10_3.runtime.Sorter;

public class BSTSort extends Sorter{

	private MyBST bst = new MyBST();
	public BSTSort () {
		
	}
	
	public int[] sort(int[] arr) {
		bst.insertAll(arr);
		return bst.readIntoArray() ;
	}
	
}
