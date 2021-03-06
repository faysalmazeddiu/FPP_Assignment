package prog12_2.employeeinfo;

public class RetirementAccount extends Account {
	private final double PENALTY_PERCENT = 2.0;

	RetirementAccount(Employee e, double startBalance){
		super(e,startBalance);
	}
	RetirementAccount(Employee e){
		super(e);
	}	
	
	public boolean makeWithdrawal(double amount) 
			throws OverdrawnAccountException{
		double balance = getBalance();
		
		double penalty = balance * (PENALTY_PERCENT/100);
		balance = balance - amount - penalty;
		if(balance < 0){
			String errMessageString="After computing penalties, your withdrawal amount exceeds your balance.";
			throw new OverdrawnAccountException(errMessageString);
		}
		setBalance(balance);
		return true;
	}
	public AccountType getAcctType(){
		return AccountType.RETIREMENT;
	}	

}
