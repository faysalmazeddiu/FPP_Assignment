package prog9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	OwnStack mystack;
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	//char[] left;
	//char[] right;
	
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
		mystack = new OwnStack();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public void clearStack() {
		mystack.makeEmpty();
	}
	
	boolean symbolsBalanced(String delimiters){
		
		char ch=delimiters.charAt(0);
		mystack.push(ch);
		
		for (int index = 1; index < delimiters.length(); index++) {
			
			if (delimiters.charAt(index) == ']' && mystack.peek() == '[')  mystack.pop();
			
			else if (delimiters.charAt(index) == '}' && mystack.peek() == '{')  mystack.pop();
				
			else if (delimiters.charAt(index) == '>' && mystack.peek() == '<') mystack.pop();
				
			else if (delimiters.charAt(index) == ')' && mystack.peek() == '(') mystack.pop();
				
			else mystack.push(delimiters.charAt(index));
			
		}
		
		return mystack.isStachEmpty();
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog9_2//Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
		
		
		
	}
	public String readFile() {
		String prefix = System.getProperty("user.dir") + "//src//";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			sc.close();
			return text;
		}catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
			return null;
		}
	}
	
	
}



