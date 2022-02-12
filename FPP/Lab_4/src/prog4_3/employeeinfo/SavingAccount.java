package prog4_3.employeeinfo;

public class SavingAccount extends Account{
	private final double MONTHLY_INTEREST_RATE = 0.25;
	
	SavingAccount(Employee employee, double balance) {
		super(employee, balance);
	}

	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	
	public double getBalance() {
		double balance = super.getBalance();
		balance += (MONTHLY_INTEREST_RATE/100)*balance;
		setBalance(balance);
		return balance;
	}
}
