import java.util.Arrays;

import java.util.HashSet;
import java.util.List;


class Manager{
	
	int empId;
	String name;
	double salary;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	Manager(String name,int id,double salary){
		this.empId=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Manager [empId=" + empId + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
	
}


public class SetPractice {
	
	public static void main(String[] args) {
	
		Manager em1=new Manager("Mazed",101,50000);
		Manager em2=new Manager("Ayub",102,45000);
		Manager em3=new Manager("Anwar",103,35000);
		Manager em4=new Manager("Mahabub",104,20000);
		HashSet<Manager> empObj=new HashSet<>();
		empObj.add(em1);
		empObj.add(em2);
		empObj.add(em3);
		empObj.add(em4);
		
		System.out.println(empObj);
		
		
		
		
		
		
		
		
		
		
		List<String> list1=Arrays.asList("Milon","Kiron", "Sazed");
		List<String> list2=Arrays.asList("Milon","Nayem");
		//list1.addAll(list2);
		
		HashSet<String> setObj=new HashSet<>(list1);
		//setObj.addAll(list2);
		HashSet<String> setObj2=new HashSet<>(list2);
//		setObj.add(null);
//		setObj.add("Abdul");
//		setObj.add("Sarif");
//		setObj.add("Rimon");
//		setObj.add("Babul");
//		setObj.add("Horon");
//		setObj.add("himal");
		
//		System.out.println(setObj.contains("Sarif"));
//		System.out.println(setObj.isEmpty());
//		System.out.println(setObj.size());
//		System.out.println(setObj.remove("himal"));
//		System.out.println(setObj.size());
//		setObj.addAll(list1);
//		setObj.addAll(list2);
		
//		setObj.addAll(setObj2);
//		System.out.println("Union "+setObj);
		
//		setObj.retainAll(setObj2);
//		System.out.println("Intersaction "+setObj);
		
		setObj.removeAll(setObj2);
		System.out.println("difference "+setObj);
		
	}
	
}
