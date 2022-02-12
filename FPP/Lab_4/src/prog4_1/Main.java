package prog4_1;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		Professor prof1=new Professor("Md Fahad",21000.00 , LocalDate.of(2020, 1, 12));
		Professor prof2=new Professor("Md Rasel",30000.00 , LocalDate.of(2020, 7, 13));
		Professor prof3=new Professor("Md Anwar",40000.00 , LocalDate.of(2020, 9, 23));
		prof1.setNumberOfPublication(10);
		prof2.setNumberOfPublication(10);
		prof3.setNumberOfPublication(10);
		Secretary sec1=new Secretary("Md Rimon",22000.00 , LocalDate.of(2021, 5, 3));
		Secretary sec2=new Secretary("Md Jonal",25000.00 , LocalDate.of(2021, 1, 1));
		sec1.setOvertimeHours(200);
		sec1.setOvertimeHours(200);
		department[0]=prof1;
		department[1]=prof2;
		department[2]=prof3;
		department[3]=sec1;
		department[4]=sec2;
		
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Do you want to see the sum of all salaries in the department,(Y/N)");
		String userInput=inputScanner.nextLine();
		double totalSalary=0.0;
		if(userInput.equalsIgnoreCase("Y")) {
			for(DeptEmployee depEmp:department){
				totalSalary=totalSalary+depEmp.computeSalary();
			}
			System.out.println("Total Salary: $"+ totalSalary);
		}
		inputScanner.close();
	}
}
