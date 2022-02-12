package prog11_1;

import java.util.Collection;
import java.util.HashMap;

public class Employee {
	public static void main(String[] args) {
		Employee emplyeeObj = new Employee();
		emplyeeObj.setFirstName("Jim");
		emplyeeObj.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			emplyeeObj.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		emplyeeObj.printPaymentAmount("3/15/2011");
		emplyeeObj.printPaymentAmount("5/15/2010");
		emplyeeObj.printAveragePaycheck();

	}
	private String firstName;
	private String lastName;
	private HashMap salaryRecordInfo;

	public Employee() {
		this.salaryRecordInfo = new HashMap<String, Double>();
	}

	public void addEntry(String salaryDate, double salary) {
		// implement
		salaryRecordInfo.put(salaryDate, salary);
	}

	public void printPaymentAmount(String salaryDate) {
		// implement
		if (salaryDate == null) {
			return;
		}
		if (salaryRecordInfo.containsKey(salaryDate)) {
			System.out.println(this.getFirstName() + " " + this.getLastName() + " has been paid " + salaryRecordInfo.get(salaryDate)
					+ " on " + salaryDate);
		} else {
			System.out.println(
					this.getFirstName() + " " + this.getLastName() + " have not recieved any paycheck on " + salaryDate);
		}

	}

	public void printAveragePaycheck() {
		// implement
		double sumOfSalary = 0.00;
		double sizeOfSalary = salaryRecordInfo.size();
		Collection<Double> salarieInfo = salaryRecordInfo.values();
		for (Double salaryValue : salarieInfo) {
			sumOfSalary += salaryValue;
		}
		double averagePaycheckAmount = sumOfSalary / sizeOfSalary;
		System.out.println("Average paycheck for " + getFirstName() + " " + getLastName() + " was $" + averagePaycheckAmount);
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
