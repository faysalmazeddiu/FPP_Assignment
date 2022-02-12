package prog4_6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	private Person person;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		this.person = new Person(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
			
		if (object == null) {
			return false;
		}
			
		if (getClass() != object.getClass()) {
			return false;
		}
			
		PersonWithJob perWjob = (PersonWithJob) object;
		if (person == null) {
			if (perWjob.person != null)
				return false;
		} else if (!person.equals(perWjob.person))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(perWjob.salary))
			return false;
		return true;
	}

}
