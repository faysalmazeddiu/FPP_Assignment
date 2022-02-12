package prog8_3.employeesort;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		String name1 = employee1.getName();
		String name2 = employee2.getName();
		Date hireDate1 = employee1.getHireDate();
		Date hireDate2 = employee2.getHireDate();
		int salary1 = employee1.getSalary();
		int salary2 = employee2.getSalary();
		int returnVal=0;
		if(salary1>salary2) {
			returnVal=1;
			
		}
		 if(salary1<salary2) {
			returnVal=-1;
			
		}
		if(salary1==salary2) {
			returnVal=0;
		}
		
		return returnVal;
	}

}
