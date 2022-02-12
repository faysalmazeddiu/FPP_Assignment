package prog3_1;

class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	
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
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance+=deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(balance>=amount) {
			balance-=amount;
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return this.balance;
	}

	

	public AccountType getAcctType() {
		return acctType;
	}

	
	
	
//	public static  AccountType getacctType(String acctType) {
//		if(acctType.equals("CHECKING") || acctType.equals("checking")) {
//			return AccountType.CHECKING;
//		}
//		else if(acctType.equals("SAVINGS") || acctType.equals("savings")) {
//			return AccountType.SAVINGS;
//		}else {
//			return AccountType.RETIREMENT;
//		}
//	}
	
	
	
	
	
	
	
	
}
