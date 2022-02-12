package prog6_3.accounts;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type:" + acctType + "\nCurrent bal:" + balance+"\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		
		if(balance>=amount) {
			balance-=amount;
			return true;
		}
		return false;
	}

	public AccountType accountType() {
		return acctType;
	}

	public double getBalance() {
		return balance;
	}
}
