package prog2_5;

import java.util.Scanner;

public class Prog5 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		System.out.printf("Enter your String : ");
		String inputString=input.nextLine();
		String reverString="";
		for(int i=inputString.length()-1;i>=0;--i) {
			char c=inputString.charAt(i);
			reverString+=c;
		}
		System.out.println(reverString);
		input.close();
		
	}

}
