package prog4_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	private double overtimeHours;
	
	public Secretary(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		//this.overtimeHours=overtimeHours;
	}
	
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours=overtimeHours;
	}
	
	public double getOvertimeHour() {
		return overtimeHours;
	}
	
	public double computeSalary() {
		return super.computeSalary()+12*overtimeHours;
	}
}
