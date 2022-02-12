package prog4_6.case2;

import java.util.GregorianCalendar;

public class Main2 {
public static void main(String[] args) {
		
		Person person1 = new Person("Md Mazed", new GregorianCalendar(2020, 3, 1));
		Person person2 = new Person("Rimon Habib", new GregorianCalendar(1983, 7, 23));
		Person person3 = new Person("Md Mazed", new GregorianCalendar(2020, 3, 1));
		PersonWithJob pwjobj1 = new PersonWithJob("Md Mazed", new GregorianCalendar(2020, 3, 1), 1000);
		PersonWithJob pwjobj2 = new PersonWithJob("Md Mazed", new GregorianCalendar(2020, 3, 1), 1000);

		System.out.println("person1 == person2 " + person1.equals(person2));
		System.out.println("person1 == person3 " + person1.equals(person3));
		System.out.println("person1 == pwjobj1 " + person1.equals(pwjobj1));
		System.out.println("pwjobj1 == person1 " + pwjobj1.equals(person1));
		System.out.println("pwjobj1 == pwjobj2 " + pwjobj1.equals(pwjobj2));
		
		//Main1.main(args);

	}
}
