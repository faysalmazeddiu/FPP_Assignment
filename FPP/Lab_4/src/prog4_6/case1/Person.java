package prog4_6.case1;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}

	public boolean equals(Object object) {
		if (object == null)
			return false;
		if (!(object instanceof Person))
			return false;
		Person person = (Person) object;
		return person.name.equals(this.name) && person.dateOfBirth.equals(this.dateOfBirth);
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	

}
