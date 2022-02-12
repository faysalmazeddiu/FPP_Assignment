package prog4_3.employeeinfo;

abstract public class Account {
	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
	private Employee employee;
	
	
	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	@Override
	public String toString() {
		return "Account type: "+getAcctType().toString().toLowerCase()+ "\nCurrent bal: " + getBalance();
	}

	public void makeDeposit(double deposit) {
		balance+=deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount<=balance) {
			balance-=amount;
			return true;
		}
		
		return false;
	}

	public double getBalance() {
		return balance;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	abstract public AccountType getAcctType();

}
