package prog4_6.case2;

import java.util.GregorianCalendar;

import prog4_6.case1.Main1;
import prog4_6.case2.Person;
import prog4_6.case2.PersonWithJob;

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
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object object) {
		if(object == null) {
			return false;
		}
		if(this.getClass() != object.getClass()) {
			return false;
		} 
		Person person = (Person)object;
		
		return person.name.equals(name) && person.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	

}
