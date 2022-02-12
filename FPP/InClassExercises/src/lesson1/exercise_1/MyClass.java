package lesson1.exercise_1;

import java.util.Arrays;

/*
 * Use SampleClass to guide you as you try to write a program that
 * prints the following lines to the console:
 
        The product of the values in {2, 5, -3, 11, 1} is -330
        A printout of the array of integers is [2, 5, -3, 11, 1]
        Concatenating the strings in arr2 gives us: ALMOST DONE
   
   Obtain the first line by creating a method 
           static int product(int[] arr)
   which multiplies together every element of arr.
   Your printed statement should include the value returned by the method product(int[] arr)
   
   Obtain the second line by using the technique in SampleClass to
   print an array of values
   
   Obtain the third line by defining an array of strings and passing
   it to a method of the form
           static String concatenate(String[] arr2)
   which concatenates all the elements of arr and returns the resulting
   String. Then print this returned value.
 */
public class MyClass {

	public static void main(String[] args) {
		System.out.println("The product of the values in {2, 5, -3, 11, 1} is "+product(new int[] {2, 5, -3, 11, 1}));
		System.out.println("A printout of the array of integers is"+ Arrays.toString(new int[] {2, 5, -3, 11, 1}));
		System.out.println("Concatenating the strings in arr2 gives us:"+ concatenate(new String[] {"ALMOST"," ","DONE"}));
	}
	
	public static int product(int[] arr) {
		int product=1;
		int count=0;
		for(int val:arr) {
			++count;
			product=product*val;
			if(count==arr.length) {
				return product;
			}
			
		}
		//implement
		return 1;
	}
	
	public static String concatenate(String[] arr2) {
		//implement
		String str="";
		for(String val:arr2) {
			str+=val;
			//str+=" ";
		}
		return str;
	}

}
