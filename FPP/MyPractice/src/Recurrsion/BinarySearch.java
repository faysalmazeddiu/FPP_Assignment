package Recurrsion;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
	public static void main(String[] args) {
		/*
		int search =40;
		int[] arr= {10,5,30,23,40,89};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	    int mid=0;
	    int start=0;
	    int end=arr.length-1;
	    while(start<end) {
	    	mid=start+(end-start)/2;
	    	if(arr[mid]==search) {
	    		System.out.println(search+" is found at position at "+mid);
	    		break;
	    	}
	    	if(arr[mid]<search) {
	    		start=mid+1;
	    	}else {
	    		end=mid-1;
	    	}
	    }
	    */
		String[] strArrStrings= {"Mazed","Sazed","Sajib"};
		String[] soretdArrStrings=sort(strArrStrings);
		System.out.println(Arrays.toString(soretdArrStrings));
		System.out.println(recurseBinarySearch(soretdArrStrings,0,soretdArrStrings.length,"Sazed"));
	}
	
	public static String[] sort(String[] arr) {
		for(int i=0;i<arr.length;++i) {
			int minPs=minPos(i,arr);
			String string=arr[i];
			arr[i]=arr[minPs];
			arr[minPs]=string;
		}
		return arr;
	}
	
//	private String[] swap(int i,int min, String[] str) {
//		// TODO Auto-generated method stub
//		String string=str[i];
//		str[i]=str[min];
//		str[min]=string;
//		return str;
//	}

	private static int minPos(int i, String[] strArr) {
		// TODO Auto-generated method stub
		int min=i;
		String string=strArr[i];
		for(int k=i+1;k<strArr.length;++k) {
			if(string.compareTo(strArr[k])>0) {
				string=strArr[k];
				min=k;
			}
		}
		return min;
	}

	public static boolean  recurseBinarySearch(String[] strArr,int start,int last,String finder) {
		int mid=(start+last)/2;
		if(start>last) {
			return false;
		}
		if(strArr[mid].equals(finder)) {
			return true;
		}
		if(finder.compareTo(strArr[mid])<0) {
			return recurseBinarySearch(strArr,0,mid-1,finder);
		}else {
			return recurseBinarySearch(strArr,mid+1,last,finder);
		}
		
	}
	
	
}
