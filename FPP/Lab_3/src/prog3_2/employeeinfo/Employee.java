package prog3_2.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
	}

	public String getName() {
		
		return this.name;
	}
	
	public LocalDate getHireDate() {
		
		return this.hireDate;
	}
	
	public void createNewChecking(double startAmount) {
		// implement
		
		checkingAcct=new Account(this, AccountType.CHECKING,startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct=new Account(this, AccountType.SAVINGS,startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct=new Account(this, AccountType.RETIREMENT,startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement
		String retVal="";
		if(checkingAcct!=null) {
			retVal+=checkingAcct.toString();
		}
		if(savingsAcct!=null) {
			retVal+=savingsAcct.toString();
		}
		if(retirementAcct!=null) {
			retVal+=retirementAcct.toString();
		}
		return retVal;//checkingAcct.toString()+savingsAcct.toString()+retirementAcct.toString();
	}
	public void deposit(String acctType, double amt){
		// implement
		if(acctType.equalsIgnoreCase(AccountType.CHECKING.toString())) {
			checkingAcct.makeDeposit(amt);
		}
		else if(acctType.equalsIgnoreCase(AccountType.SAVINGS.toString())) {
			savingsAcct.makeDeposit(amt);
		}else if(acctType.equalsIgnoreCase(AccountType.RETIREMENT.toString())){
			retirementAcct.makeDeposit(amt);
		}
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		if(acctType.equalsIgnoreCase(AccountType.CHECKING.toString())) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(acctType.equalsIgnoreCase(AccountType.SAVINGS.toString())) {
			return savingsAcct.makeWithdrawal(amt);
		}else if(acctType.equalsIgnoreCase(AccountType.RETIREMENT.toString())){
			return retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}

}
