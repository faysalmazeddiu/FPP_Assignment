package prog4_6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object object) {
		if(object == null)
			return false;
		if(this.getClass() != object.getClass())
			return false;
		PersonWithJob personWithJob = (PersonWithJob)object;
		boolean isEqual = this.getName().equals(personWithJob.getName()) && this.getDateOfBirth().equals(personWithJob.getDateOfBirth()) && this.salary == personWithJob.salary;
				
		return isEqual;
	}
	
	
	

}
