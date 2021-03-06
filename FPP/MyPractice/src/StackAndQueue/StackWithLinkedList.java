package StackAndQueue;



public class StackWithLinkedList {
	Node headerNode;
	public static void main(String[] args) {
		StackWithLinkedList stackWithLinkedList=new StackWithLinkedList();
		stackWithLinkedList.push("Mazed");
		stackWithLinkedList.push("Sazed");
		stackWithLinkedList.push("Sajib");
		stackWithLinkedList.push("Rimon Mostafiz");
		stackWithLinkedList.push("Fahad");
		System.out.println(stackWithLinkedList);
		//stackWithLinkedList.peek();
		stackWithLinkedList.pop();
		stackWithLinkedList.pop();
		stackWithLinkedList.pop();
		stackWithLinkedList.push("Helaly Vai");
		System.out.println(stackWithLinkedList);
	}
	StackWithLinkedList(){
		headerNode=new Node(null);
	}

	
	 public void push(String c) {
		 Node newNode=new Node(c);

		 if(headerNode.nextNode!=null) {
			 //headerNode.nextNode.prevNode=newNode;
			 newNode.prevNode=headerNode;
			 newNode.nextNode=headerNode.nextNode;
		 }
		 headerNode.nextNode=newNode;
		 //System.out.println("Data inserted into stack");
	 }
	 
	 public void pop() {
		 System.out.println("======"+headerNode.nextNode.charecter);
		 if(headerNode.nextNode !=null) {
			 System.out.println(headerNode.nextNode.charecter+" is removed from stack \n");
			 headerNode.nextNode=headerNode.nextNode.nextNode;
			 headerNode.nextNode.nextNode.prevNode=headerNode;
			 
		 }else {
			 System.out.println("Sorry Stack is Empty");
		 }
		 
	 }
	 
	 public void peek() {
		 if(headerNode.nextNode !=null) {
			 System.out.println(headerNode.nextNode.charecter+" is peeked up from stack");
		 }else {
			 System.out.println("Sorry Stack is Empty");
		 }
	 }
	 
	 public String toString() {
		
		 if(headerNode.nextNode==null) {return "Stack is empty";}
		 Node currentNode=headerNode.nextNode;
		 while( currentNode!= null) {
			 System.out.println(currentNode.charecter);
			 currentNode=currentNode.nextNode;
		 }
		 return "";
	 }
}

class Node{
	String charecter;
	Node nextNode;
	Node prevNode;
	public Node(String  ch) {
		this.charecter=ch;
	}
}
