package CompairablePractice;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		/*
		String aString="b";
		System.out.println(aString.compareTo("a"));
		System.out.println("a".compareTo(aString));
		*/
		Employee[] employees= {
				new Employee("Mazed", 27),
				new Employee("Mahabub", 34),
				new Employee("Kamrul", 56),
				new Employee("Ayub", 30),
		};
		Arrays.sort(employees);
		System.out.println(Arrays.toString(employees));
	}
}

class Employee implements Comparable<Employee>{
	String nameString="";
	int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(String name,int age){
		this.nameString=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name "+nameString+" age "+age;
	}
	/*
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age>o.age) {
			return 1;
		}
		if(this.age<o.age) {
			return -1;
		}
		if(this.age==o.age) {
			return 0;
		}
		return -1;
	}*/
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.nameString.compareTo(o.nameString)==1) {
			return 1;
		}
		if(this.nameString.compareTo(o.nameString)==-1) {
			return -1;
		}
		if(this.nameString.compareTo(o.nameString)==0) {
			return 0;
		}
		return -1;
	}
	
	
}
