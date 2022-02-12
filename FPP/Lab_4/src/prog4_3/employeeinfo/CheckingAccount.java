package prog4_3.employeeinfo;

public class CheckingAccount extends Account{
	private final double MONTHLY_SERVICE_CHARGE = 5.00;
	
	CheckingAccount(Employee employee, double balance) {
		super(employee, balance);
	}
	CheckingAccount(Employee employee){
		super(employee);
	}
	
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	public double getBalance() {
		double balance = super.getBalance() - MONTHLY_SERVICE_CHARGE;
		setBalance(balance);
		return balance;
	}
}
