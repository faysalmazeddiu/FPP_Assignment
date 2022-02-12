import java.util.Arrays;
import java.util.Scanner;
enum EmployeeType{
	CHECKING,SAVING,RETIREMENT;
}
public class ForLoopPractice {
//	static  int val=3;
//	public void mMy() {
//		int d=val;
//	}
	public static void main(String[] args) {
		/*
		int mod=2%5*4/5-1+1;
		System.out.println(mod);
		/*
		String aString="Hello Mazed,How_are you.Hope you are fine.How is you parents.";
		System.out.println(aString);
		String[] splitStrings=aString.split(" |,|_|\\.");
		System.out.println(Arrays.toString(splitStrings));
		*
//		for(String s:splitStrings) {
//			System.out.println(s);
//		}
		
		
		/*
		EmployeeType employeeType=EmployeeType.RETIREMENT;
		double salary=0;
		System.out.println(employeeType);
		switch(employeeType) {
			case CHECKING:
				salary+=100;
				break;
			case SAVING:
				salary=+200;
				break;
			case RETIREMENT:
				salary=+300;
				break;
			default:
				salary=0;
				
		}
		System.out.println(salary);
		
		*/
		
		/*
		int i=1;
		for(; ;) {
			System.out.println(i);
			if(i==10) {
				System.out.println("Break the loop");
				break;
			}
			++i;
		}
		*/
		
		/*
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Please Enter you name");
		String nameString=inputScanner.nextLine();
		int countE=0;
		for(int i=0;i<nameString.length();++i) {
			char c=nameString.charAt(i);
			if(c=='e' || c=='E') {
				++countE;
			}
		}
		System.out.println(countE);
		*/
		
		String aString= new String("Mazed");
		String bString="Mazed";
		System.out.println(aString == bString);
		
	}
}
