package prog02.inner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		Stack<Character> myStack= new Stack<Character>();
		int length = delimiters.length();
		left = new char[length/2];
		right = new char[length/2];
		for (int i=0; i<length/2; i++) {
			left[i] = delimiters.charAt(i+i);
			right[i] = delimiters.charAt(i+i+1);
		}

		int tLen = text.length();
		for (int i=0; i<tLen; i++) {
			char c = text.charAt(i);
			for(int j=0; j<left.length; j++) {
				if(left[j]==c) {
					myStack.add(c);
					break;
				}
			}
			for(int j=0; j<right.length; j++) {
				if(right[j]==c) {
					if(myStack.isEmpty()) return false;
					myStack.pop();
					break;
				}
			}
		}
		if(myStack.isEmpty()) return true;
		return false;
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog02//Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "//src//";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			//System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}
	
}



