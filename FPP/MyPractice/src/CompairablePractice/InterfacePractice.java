package CompairablePractice;

import java.util.Arrays;

public class InterfacePractice {
	public static void main(String[] args) {
		People[] peoples= {
				new People("Anwar",30),
				new People("Mazed",27),
				
				new People("Mahabub",34),
				new People("Bikrom",12),
				
		};
		Integer[] integers = {10,9,2,8,1};
		Arrays.sort(integers);
		System.out.println(Arrays.toString(integers));
		
		/*
		  object 
		Arrays.sort(peoples);
		for (People p : peoples) {
			System.out.println(p.nameString + "===" + p.age);
		}
		*/
		
	}
	
    
	
}

class People implements Comparable<People>{
	String nameString;
	int age;
	People(){
		
	}
	People(String name,int id){
		this.nameString=name;
		this.age=id;
	}
	@Override
	public int compareTo(People o) {
		if(age>o.age) {
			return 1;
		}
		if(age<o.age) {
			return -1;
		}
		if(age==o.age){
			return 0;
		}
		return -1;
	}
	
}
