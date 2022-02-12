package lab.prog9_1;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		String s = peek();
		if (s != null) {
			list.remove(0);
			return s;
		}else {
			return null;
		}
	}
	public String peek() {
		//implement
		String s = list.get(0);
		return s;
	}
	
	public void push(String s) {
		//implement
		if (s != null) {
			list.add(s);
		}
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
	}
}
