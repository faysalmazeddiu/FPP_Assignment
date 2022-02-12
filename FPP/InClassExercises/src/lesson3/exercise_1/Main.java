package lesson3.exercise_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(1970, 1, 2));
		Date date = dateFromLocalDate(LocalDate.of(1970, 1, 2));
		System.out.println(date);
		long numHours = date.getTime()/(60*60*1000); //implement
		System.out.println(numHours);
		//output numHours to the console

	}

	public static Date dateFromLocalDate(LocalDate localDate) {
		//implement
		Calendar calendar=new GregorianCalendar(localDate.getYear(),localDate.getMonth().getValue()-1,localDate.getDayOfMonth());
		return calendar.getTime();
	}
	
	//static Date
}
