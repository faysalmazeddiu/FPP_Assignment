package prog4_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	private int numberOfPublications;
	
	public Professor(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		//this.numberOfPublications=numberOfPublications;
	}
	
	public int getNumberOfPublication() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublication(int numberOfPublications) {
		this.numberOfPublications=numberOfPublications;
	}
}
