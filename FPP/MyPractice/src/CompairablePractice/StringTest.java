package CompairablePractice;

import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) {
		MyString myString=new MyString("Mazed");
		MyString myString1=new MyString("Kamrul");
		MyString myString2=new MyString("Anwar Hossain");
		MyString myString3=new MyString("Rimon Mostafiz");
		
		MyString[] mystrArrMyStrings= {
				myString,myString1,myString2,myString3
		};
		Arrays.sort(mystrArrMyStrings);
		for(MyString nam:mystrArrMyStrings) {
			System.out.println(nam.nameString);
		}
	}
}
