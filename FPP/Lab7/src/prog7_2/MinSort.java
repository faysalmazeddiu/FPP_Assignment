package prog7_2;

import java.util.Arrays;

public class MinSort {
	
	public static void main(String[] args) {
		String s = "zwxuabfkafutbbbb";
		MinSort ms = new MinSort(s);
		ms.sort();
		System.out.println(Arrays.toString(ms.charecterArr));
	}
	
	char[] charecterArr;
	MinSort(String str){
		this.charecterArr = str.toCharArray();
	}
	public void sort(){
		if(charecterArr == null || charecterArr.length <=1) return;
		int lenth = charecterArr.length;
		int temp = 0;
		for(int i = 0; i < lenth; ++i){
			int nextMinPos = minpos(i,lenth-1);
			swapChar(i,nextMinPos); 
		}
		
	}
	public void swapChar(int i, int j){
		char tempArr = charecterArr[i];
		charecterArr[i] = charecterArr[j];
		charecterArr[j] = tempArr;
		
	}
	
	public int minpos(int bellow, int upper){		
		int m = charecterArr[bellow];
		int index = bellow;
		for(int i = bellow+1; i <= upper; ++i){
			if(charecterArr[i] < m){ 
				m = charecterArr[i];
				index = i;
			}
		}
		
		return index;
	}
	
	

}
