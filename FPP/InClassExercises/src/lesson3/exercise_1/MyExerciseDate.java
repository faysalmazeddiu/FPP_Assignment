package lesson3.exercise_1;

import java.util.Date;
import java.time.LocalDate;
public class MyExerciseDate {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		String format = "%tD";
		//System.out.println(format);
		String formattedDate = String.format(format, d);
		System.out.println(formattedDate);
		
		System.out.println("Today's date: " + LocalDate.now());
		System.out.println("Specified date: " + LocalDate.of(2000, 1, 1));
	}
}
