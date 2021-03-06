package prog9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	ArrayStack stack;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
		stack = new ArrayStack();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	//stack force clear after using one's
	public void forceClear() {
		stack.forceEmpty();
	}
	
	boolean symbolsBalanced(String delimiters){
		//implement
		stack.push(delimiters.charAt(0));
		for (int i = 1; i < delimiters.length(); i++) {
			if (delimiters.charAt(i) == ']' && stack.peek() == '[') {
				stack.pop();
			}else if (delimiters.charAt(i) == '}' && stack.peek() == '{') {
				stack.pop();
			}else if (delimiters.charAt(i) == '>' && stack.peek() == '<') {
				stack.pop();
			}else if (delimiters.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			}else {
				stack.push(delimiters.charAt(i));
			}
		}
		
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog9_2//Employee.java");
		
		System.out.println("======expected balance=========");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
		
		/*
		sb.forceClear();
		System.out.println(sb.symbolsBalanced("({[]})"));
		sb.forceClear();
		System.out.println(sb.symbolsBalanced("{[]()}"));
		sb.forceClear();
		
		
		System.out.println("======expected unbalance=========");
		System.out.println(sb.symbolsBalanced("{(}"));
		sb.forceClear();
		System.out.println(sb.symbolsBalanced("([(()])"));
		sb.forceClear();
		System.out.println(sb.symbolsBalanced("{}[])"));
		sb.forceClear();
		
		System.out.println("======check Employee.java=========");
		String text = sb.readFile();
		if (text != null) {
			System.out.println(sb.symbolsBalanced(text));
			sb.forceClear();
		}
		*/
	}
	public String readFile() {
		String prefix = System.getProperty("user.dir") + "//src//";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
			return text;
		}catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
			return null;
		}
	}
	
//	public String temp = "public Employee(String name, double salary, int year, int month, int day){\r\n"
//			+ "		this.name = name;\r\n"
//			+ "		this.salary = salary;\r\n"
//			+ "		GregorianCalendar cal = \r\n"
//			+ "			new GregorianCalendar(year,month,day);\r\n"
//			+ "		hireDate= cal.getTime();\r\n"
//			+ "	}\r\n"
//			+ "\r\n"
//			+ "	public Date getHireDate() {\r\n"
//			+ "		return (Date)hireDate.clone();\r\n"
//			+ "	}\r\n"
//			+ "	public String getName() {\r\n"
//			+ "		return name;\r\n"
//			+ "	}\r\n"
//			+ "	public double getSalary() {\r\n"
//			+ "		return salary;\r\n"
//			+ "	}";
//	
	
}



