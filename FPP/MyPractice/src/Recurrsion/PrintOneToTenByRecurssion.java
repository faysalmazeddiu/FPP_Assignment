package Recurrsion;

import java.util.Arrays;


public class PrintOneToTenByRecurssion {
	public static void main(String[] args) {
		//increaseOne(1);
		//reduceByOne(10);
		// linearSearch(new int[] {12,34,9,7,1,23,0,56},0,56,0);
		binarySearch(new int[] {12,34,9,7,1,23,0,56},0,7,56,0);
	}
	
	static void increaseOne(int n) {
		if(n<=5) {
			//System.out.println(n);
			increaseOne(n+1);
		}
		System.out.println(n);
	}
	
	static void reduceByOne(int n) {
		if(n>=0) {
			//System.out.println(n);
			reduceByOne(n-1);
		}
		System.out.println(n);
	}
	
	static void linearSearch(int[] arr,int i, int searchEle,int loop) {
		/*
			if(arr[i]==searchEle) {
				System.out.println(searchEle+ " has been found in the possition of "+i);
				return;
			}
			else {
				linearSearch(arr,++i,searchEle);
			}
		*/
		
		if(arr[i]!=searchEle) {
			linearSearch(arr,++i,searchEle,++loop);
		}
		else {
			//++loop;
			System.out.println("==="+loop);
			System.out.println(searchEle+ " has been found in the possition of "+i);
			return;
		}
		
	}
	
	static void binarySearch(int[] arr,int start,int end,int searchEle,int loop) {
		Arrays.sort(arr);
		if(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==searchEle) {
				System.out.println(searchEle+ " has been found in the possition of "+mid+" with loop"+loop);
				return;
			}
			if(arr[mid]<searchEle) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			binarySearch(arr,start,end,searchEle,++loop);
		}
	}
}
