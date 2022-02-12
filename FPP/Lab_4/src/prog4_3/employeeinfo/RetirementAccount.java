package prog4_3.employeeinfo;

public class RetirementAccount extends Account {
	private final double PENALTY = 2.0;
	
	RetirementAccount(Employee employee, double balance) {
		super(employee, balance);
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	
	public boolean makeWithdrawal(double amount){
		double balance = getBalance();
		balance = balance-(balance*(PENALTY/100)) - amount;
		if(balance < 0) return false;
		setBalance(balance);
		return true;
	}
}
