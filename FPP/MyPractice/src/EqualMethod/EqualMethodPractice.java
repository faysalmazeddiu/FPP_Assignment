package EqualMethod;



public class EqualMethodPractice {
	public static void main(String[] args) {
		Employee emp1= new Employee("Mazed",4000);
		LeadDeveloper emp2= new LeadDeveloper("Mazed",4000,"CSC");
		
		//System.out.println(emp2 instanceof LeadDeveloper);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp1));
		
	}
}

class Employee{
	
	String nameString;
	double salary;
	Employee(String name,double salary){
		this.nameString=name;
		this.salary=salary;
	}
	
	
	
	public String getNameString() {
		return nameString;
	}


	public double getSalary() {
		return salary;
	}




    
	@Override
	public boolean equals(Object objEmployee) {
		// TODO Auto-generated method stub
		if(objEmployee==null) return false;
		if(!(objEmployee instanceof Employee)) {
			return false;
		}
		Employee employee=(Employee)objEmployee;
		boolean isEqual=false;
		if(nameString.equals(employee.nameString)) {
			isEqual=true;
		}
		return isEqual;
	}
	
}

class LeadDeveloper extends Employee{
	String deptString;
	LeadDeveloper(String name,double salary, String deptString){
		super(name,salary);
		this.deptString=deptString;
	}
	

	@Override
	public boolean equals(Object objLeadDev) {
		// TODO Auto-generated method stub
		if(objLeadDev==null) {
			return false;
		}
		if(!(objLeadDev instanceof LeadDeveloper)) {
			return false;
		}
		
		LeadDeveloper leadDeveloper=(LeadDeveloper)objLeadDev;
		boolean isEqual=false;
		if(getNameString().equals(leadDeveloper.nameString) && deptString.equals(leadDeveloper.deptString)) {
			isEqual=true;
		}
		return isEqual;
		
	}
	
}
