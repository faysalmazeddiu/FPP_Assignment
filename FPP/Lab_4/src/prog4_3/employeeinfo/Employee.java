package prog4_3.employeeinfo;

import java.time.LocalDate;

import prog4_3.MyStringList;
//import util.MyUtil;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private AccountList accounts;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}

	public void createNewChecking(double startAmount) {
		accounts.add(new CheckingAccount(this, startAmount));
	}

	public void createNewSavings(double startAmount) {
		accounts.add(new SavingAccount(this, startAmount));
	}

	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		for (int i =0; i<accounts.size(); i++) {
			if(accounts.get(i)!=null)sb.append(accounts.get(i).toString()).append("\n");
		}		
		return sb.toString();
	}
	public void deposit(int accountIndex, double amt){
		accounts.get(accountIndex).makeDeposit(amt);
	}
	
	public boolean withdraw(int accountIndex,double amt){
		return accounts.get(accountIndex).makeWithdrawal(amt);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return LocalDate.from(hireDate);
	}
	
	public MyStringList getNamesOfAccounts() {
		MyStringList list = new MyStringList();
		for(int i=0; i<accounts.size(); i++) {
			list.add(accounts.get(i).getAcctType().toString().toLowerCase());
		}
		return list;
	}
	
	public String getAcctType(int accountIndex) {
		return accounts.get(0).getAcctType().toString().toLowerCase();
	}
}
