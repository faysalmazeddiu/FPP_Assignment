package prog3_1;

public class Main {
	public static void main(String[] args) {
		Employee firstEmployee=new Employee("Faysal", "Mazed", 3000, 2021, 7, 28);
		
		

		Account[] accforFirstEmployee= {
				new Account(firstEmployee, AccountType.CHECKING, 300),
				new Account(firstEmployee, AccountType.SAVINGS, 300),
				new Account(firstEmployee, AccountType.RETIREMENT, 300)
		};
		for(Account empAcc:accforFirstEmployee) {
			System.out.println(empAcc.toString());
		}
	}
}
