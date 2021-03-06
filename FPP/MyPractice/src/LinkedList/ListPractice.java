package LinkedList;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListPractice  {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mazed", 112);
		Employee e2 = new Employee("Mazed", 113);
		Employee e3 = new Employee("Mazed", 114);
		List<Employee> list = new LinkedList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Employee e4 = new Employee("sazed", 115);
		Employee e5 = new Employee("sajib", 116);
		Employee e6 = new Employee("milon", 117);
		List<Employee> list2 = new LinkedList<>();
		list2.add(e4);
		list2.add(e5);
		list2.add(e6);
		//list2.sort(new AgeComaparator());
		//Collections.sort(list2,new AgeComaparator());
		int index=Collections.binarySearch(list2, new Employee("sazed", 115),new AgeComaparator());
		System.out.println(index);
		
		
		
		/*
		list2.forEach(x->System.out.print(x.toString()));
		List<List<Employee>> listOfEmployeeList=new LinkedList<List<Employee>>();
	    listOfEmployeeList.add(list); 
	    listOfEmployeeList.add(list2);
	    listOfEmployeeList.forEach(x-> x.forEach(y-> System.out.println(y)));
	    */
		
		/*
		 * List<List<Employee>> listOfEmployeeList=new LinkedList<List<Employee>>();
		 * listOfEmployeeList.add(list); listOfEmployeeList.add(list2);
		 * //Collections.sort(list2); for(List<Employee> listEmp:listOfEmployeeList) {
		 * for(Employee em:listEmp) { System.out.println(em.toString()); } }
		 * 
		 * System.out.println(listOfEmployeeList);
		 * 
		 * // for loop for(int i=0;i<list.size();++i) {
		 * System.out.println(list.get(i).toString()); }
		 * 
		 * // foreach loop for(Employee e:list) { System.out.println(e.toString()); }
		 * 
		 * /* // iterator Iterator<Employee> emIterator=list.iterator();
		 * while(emIterator.hasNext()) {
		 * System.out.println(emIterator.next().toString()); }
		 * 
		 * var emIterator=list.iterator(); while(emIterator.hasNext()) {
		 * System.out.println(emIterator.next().toString()); }
		 * 
		 * }
		 * 
		 * @Override public Object get(int index) { // TODO Auto-generated method stub
		 * return null; }
		 * 
		 * @Override public int size() { // TODO Auto-generated method stub return 0; }
		 */
	}
}

class AgeComaparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.Age>o2.Age) {
			return 1;
		}
		if(o1.Age<o2.Age) {
			return -1;
		}
		return 0;
	}
	
}

class Employee {
	String nameString;
	int Age;
	
	public Employee(String name, int age) {
		// TODO Auto-generated constructor stub
		this.nameString = name;
		this.Age = age;
	}

	@Override
	public String toString() {
		return nameString + "===" + Age+" \n";
	}
}
