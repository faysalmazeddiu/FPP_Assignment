package Recurrsion;

import java.util.Arrays;


public class Lab_7_2 {
	public static void main(String[] args) {
		Lab_7_2 obj=new Lab_7_2();
		System.out.println(obj.sort("zwxuabfkafutbbbb"));
		
	}
	
	
	public String sort(String string) {
		if(string==null || string =="") {
			return string;
		}else {
			int minPos=minPos(0,string.toCharArray());
			String str=swap(0,minPos,string.toCharArray());
			String newString=String.valueOf(str.charAt(0));
			return newString+sort(str.substring(1));
			
		}
	}
	
	public String swap(int i,int min,char[] c) {
		char tempChar=c[i];
		c[i]=c[min];
		c[min]=tempChar;
		String str="";
		for(char cVAl:c) {
			str+=String.valueOf(cVAl);
		}
		return str;
	}
	
	public int minPos(int i,char[] c) {
		int min=i;
		char minChar=c[i];
		for(int j=i+1;j<c.length;++j) {
			if(minChar>c[j]) {
				min=j;
				minChar=c[j];
			}
		}
		return min;
	}
	
	/*
	public void minSort(int index) {
		if(cArr !=null || cArr.length!=0) {
			for(int i=0;i<cArr.length;++i) {
				int minPos=minPos(i);
				swap(i, minPos);
			}
		}
	}
	
	*/
	/*
	public int minPos(int i) {
		int min=i;
		char minChar=cArr[i];
		for(int j=i+1;j<cArr.length;++j) {
			if(minChar>cArr[j]) {
				min=j;
				minChar=cArr[j];
			}
		}
		return min;
	}
	
	public void swap(int pos,int minPos) {
		char tempChar=cArr[pos];
		cArr[pos]=cArr[minPos];
		cArr[minPos]=tempChar;
	}
	*/
}
