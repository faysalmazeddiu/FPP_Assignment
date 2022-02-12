package date_practice;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Locale;
public class DatePractice {
	public static void main(String[] args) {
		//System.out.println("Today's date: " + LocalDate.now()); // Today's date: 2021-09-01
		//System.out.println("Today's date MM/dd/yyyy: " + localDateAsString(LocalDate.now())); // Today's date MM/dd/yyyy: 09/01/2021
		//System.out.println("Specified date: " + LocalDate.of(2000, 1, 1)); //Specified date: 2000-01-01
		
		GregorianCalendar cal = new GregorianCalendar(2021, 9 - 1, 7);
		Date  hireDay = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy",Locale.US);
		System.out.println(formatter.format(hireDay));
		
		//System.out.println(hireDay);
		
		
	}
	public static final String DATE_PATTERN = "MM/dd/yyyy"; 
	public static String localDateAsString(LocalDate date) {  //pattern: "MM/dd/yyyy"
		return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}

}
