package prog8_3.employeesort;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		int returnVal=0;
		if(employee1.getHireDate().getTime() > employee2.getHireDate().getTime()) {
			returnVal=1;
		}
		if(employee1.getHireDate().getTime() < employee2.getHireDate().getTime()) {
			returnVal=-1;
		}
		if(employee1.getHireDate().getTime() == employee2.getHireDate().getTime()) {
			returnVal=0;
		}
		return  returnVal;  
	}
	
}
