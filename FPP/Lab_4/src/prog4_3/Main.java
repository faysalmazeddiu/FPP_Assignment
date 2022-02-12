package prog4_3;

import java.util.Scanner;

import prog4_3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	

		Scanner input = new Scanner(System.in);
		displayOptions();
		String userInput = input.next();
			if(userInput.equalsIgnoreCase("a")){
				String formatedinfo = getFormattedAccountInfo();
				System.out.println(formatedinfo);
			} else if(userInput.equalsIgnoreCase("b") || userInput.equalsIgnoreCase("c")){
				System.out.println(getEmployeeList());
				System.out.println("Choose an employee: (please Enter number)");
				int memberAccList = input.nextInt();
				if(memberAccList<emps.length) {
					System.out.println(getAccountList(emps[memberAccList].getNamesOfAccounts()));	
					System.out.println("Choose an account: (please Enter number)");	
					
					int accType = input.nextInt();
					if(accType<emps[memberAccList].getNamesOfAccounts().size()){

						if(userInput.equalsIgnoreCase("b")) System.out.println("Deposit amount:");
						else if(userInput.equalsIgnoreCase("c")) System.out.println("Withdraw amount:");
						
						double money = input.nextDouble();
						if(userInput.equalsIgnoreCase("b")) {
							emps[memberAccList].deposit(accType, money);
							System.out.println("$"+money+" was deposited in the "+emps[memberAccList].getAcctType(accType)+" account of "+emps[memberAccList].getName());
						} else if(userInput.equalsIgnoreCase("c")) {
							if (emps[memberAccList].withdraw(accType, money))
								System.out.println("$"+money+" was withdrawn from the "+emps[memberAccList].getAcctType(accType)+" account of "+emps[memberAccList].getName());
						} 
					}
					else {
						System.out.println("Sorry !! you selected wrong option");
					}
				} else {
					System.out.println("Sorry !! you selected wrong option");
				}
			}else {
				System.out.println("Sorry !! you selected wrong option");
				
			}
			input.close();
	}

	String getFormattedAccountInfo(){
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i<emps.length; i++) {
			stringBuilder.append("ACCOUNT INFO FOR ");
			stringBuilder.append(emps[i].getName());
			stringBuilder.append(" :\n\n");
			stringBuilder.append(emps[i].getFormattedAcctInfo());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
	String getEmployeeList() {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i<emps.length; i++) {
			stringBuilder.append(i+". ");
			stringBuilder.append(emps[i].getName());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
	String getAccountList(MyStringList list) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			stringBuilder.append(i+". ");
			stringBuilder.append(list.get(i));
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
	void displayOptions(){
		String n = System.getProperty("line.separator");
		String dMessage = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION"
				+ "\nA. See a report of all accounts."
				+ "\nB. Make a deposit."
				+ "\nC. Make a withdrawal."
				+ "\nN. Exit the system."
				+ "\nMake a selection (A/B/C):";
		System.out.println(dMessage);
		
	}
}
