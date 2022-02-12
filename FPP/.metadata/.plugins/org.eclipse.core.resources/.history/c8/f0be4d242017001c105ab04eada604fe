package prog9_2;

public class ArrayStack {
	
	private static final int LEN = 500;
	private int top = -1;
	private int nextOpen = 0;
	private Character [] arr = new Character[LEN];
	
	public void push(Character ch) {
		if (!checkDelimiters(ch)) return;
		arr[nextOpen] = ch;
		top++;
		nextOpen++;
	}
	
	public Character peek() {
		return top == -1 ? '\0' : arr[top];
	}
	
	public char pop() {
		Character ch = peek();
		if (ch != '\0') {
			arr[top] = '\0';
			top--;
			nextOpen--;
		}
		return ch;
	}
	
	boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	//stack force clear after using one's
	void forceEmpty() {
		top = -1;
		nextOpen = 0;
	}
	
	boolean checkDelimiters(Character ch) {
		switch (ch) {
		case '[':
		case ']':
		case '{':
		case '}':
		case '<':
		case '>':
		case '(':
		case ')':
			return true;
		default:
			return false;
		}
	}
	
	@Override
	public String toString() {
		if (top == -1) return "<empty>";
		StringBuilder sb = new StringBuilder();
		for (Character ch : arr) {
			if (ch != null) {
				sb.append(ch.toString()+" ");
			}
		}
		return sb.toString();
	}

}
