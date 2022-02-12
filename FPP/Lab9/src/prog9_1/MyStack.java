package prog9_1;

public class MyStack {
	private MyStringLinkedList list;
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
	}
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		String popValue=peek();
		if(popValue !=null) {
			list.remove(0);
			return popValue;
		}
		return null;
	}
	public String peek() {
		//implement
		return list.get(0);
	}
	
	public void push(String s) {
		//implement
		if(!(s.equals("")) || s!=null) {
			list.add(s);
		}
	}
}
