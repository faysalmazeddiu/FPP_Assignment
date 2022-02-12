package Reference;

public class CallByValueNonPremative {
	public static void main(String[] args) {
		int val=12;
		CallByValue(val);
		System.out.println(val);
		//double val=20000;
		Employee employee=new Employee("Mazed", 20000);
		//callByValueWithObj(employee);
		//System.out.println(employee.salary);
		Employee employee2=new Employee("Sazed", 22000);
		swap(employee,employee2);
		System.out.println(employee.toString());
		System.out.println(employee2.toString());
	}
	
	public static void swap(Employee e1,Employee e2) {
		Employee tempE=e1;
		e1=e2;
		e2=tempE;
	}
	
	// call by value with premative type
	public static void CallByValue(int val) {
		// TODO Auto-generated method stub
		val=50;
	}
	
	
	// call by value with reference type
	public static void callByValueWithObj(Employee e) {
		e.raiseSalary(200);
	}
	
}

class Employee{
	String empNameString;
	double salary;
	public Employee(String name,double salary) {
		// TODO Auto-generated constructor stub
		this.empNameString=name;
		this.salary=salary;
	}
	public void raiseSalary(double val) {
		this.salary+=val;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+this.empNameString+" salary"+this.salary;
	}
}
