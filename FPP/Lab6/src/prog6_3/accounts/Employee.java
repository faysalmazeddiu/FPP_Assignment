package prog6_3.accounts;

import java.time.LocalDate;

import prog6_3.accounts.AccountType;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// Replace these lines with LocalDate references
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public String getName() {
		return name;
	}

	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public Account getSavingsAcct() {
		return savingsAcct;
	}

	public Account getCheckingAcct() {
		return checkingAcct;
	}

	public Account getRetirementAcct() {
		return retirementAcct;
	}

	public void deposit(AccountType acctType, double amt) {
		
		if(acctType.equals(AccountType.CHECKING)) {
			checkingAcct.makeDeposit(amt);
		}
		else if(acctType.equals(AccountType.SAVINGS)) {
			savingsAcct.makeDeposit(amt);
		}else if(acctType.equals(AccountType.RETIREMENT)){
			retirementAcct.makeDeposit(amt);
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		
		if(acctType.equals(AccountType.CHECKING)) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(acctType.equals(AccountType.SAVINGS)) {
			return savingsAcct.makeWithdrawal(amt);
		}else if(acctType.equals(AccountType.RETIREMENT)){
			return retirementAcct.makeWithdrawal(amt);
		}else {
			return false;
		}
		
	}

	public String getFormattedAcctInfo() {
		// implement
		String retString = "";
		retString=retString+"Account info for ";
		retString =retString+ getName()+":\n\n";
		retString =retString+ getCheckingAcct();
		retString =retString+ getSavingsAcct();
		retString =retString+ getRetirementAcct();
		
		retString += "\n";
		return retString;
	}

}
