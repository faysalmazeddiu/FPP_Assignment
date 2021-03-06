import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class MapPractice {
	public static void main(String[] args) {
		Employee em5=null;
		Employee em6=null;
		Employee em1=new Employee("Mazed",101,50000);
		Employee em2=new Employee("Ayub",102,45000);
		Employee em3=new Employee("Anwar",103,35000);
		Employee em4=new Employee("Mahabub",104,20000);
		Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
		employeeMap.put(em4.empId, em4);
		employeeMap.put(em2.empId, em2);
		employeeMap.put(em1.empId, em1);
		employeeMap.put(105, em3);
		employeeMap.put(em3.empId, em3);
		employeeMap.put(106, em3);
		
		//employeeMap.put(null, em5);
		//employeeMap.put(null, em6);
		//employeeMap.put(101, new Employee("Rimon",101,60000));
		
		// featching technique for hashmap
		/*
		for(Employee emp:employeeMap.values()) {
			System.out.println(emp.empId+"==="+emp.name+"==="+emp.salary);
		}
		*/
		//System.out.println(em5+"===="+em6);
		System.out.println(employeeMap.get(em1.empId));
		System.out.println(employeeMap.containsKey(102));
		System.out.println(employeeMap.containsValue(em6));
		System.out.println(employeeMap.size());
		System.out.println(employeeMap.isEmpty());
		//employeeMap.remove(em1);
		//System.out.println(employeeMap.replace(103,new Employee("Rimon",101,60000)));
		
		System.out.println("\n");
		
		Iterator<Integer> key=employeeMap.keySet().iterator();
		while(key.hasNext()) {
			System.out.println(key.next());
		}
		
		System.out.println("\n");
		
		for(Employee emp:employeeMap.values()) {
			System.out.println(emp.empId+"==="+emp.salary);
		}
		
		for(Entry<Integer,Employee> emKeyValue:employeeMap.entrySet()) {
			System.out.println(emKeyValue.getKey()+"===="+emKeyValue.getValue().empId+"====="+emKeyValue.getValue().name+"====="+emKeyValue.getValue().salary);
		} 
		
		
		
		
	}
}

class Employee{
	
	int empId;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String name,int id,double salary){
		this.empId=id;
		this.name=name;
		this.salary=salary;
	}
}
