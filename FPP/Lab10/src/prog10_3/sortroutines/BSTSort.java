package prog10_3.sortroutines;

import java.util.Arrays;

import prog10_3.runtime.Sorter;

public class BSTSort extends Sorter {

	private MyBST myBst;
	public BSTSort() {
		myBst = new MyBST();
	}
	

	@Override
	public int[] sort(int[] array) {
		myBst.insertAll(array);
		return myBst.readIntoArray();
	}
	
	public static void main(String[] args) {
		int[] test = {21,13,1,-22, 51, 5, 18};
		BSTSort bs = new BSTSort();
		System.out.println(Arrays.toString(bs.sort(test)));
	}

}
