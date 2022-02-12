package ListImplementation;


class Node {
	String dataString;
	Node nextNode;
	public Node(String data) {
		dataString = data;
	}	
}

public class SinglyLinkedList {
	int size=0;
	Node headNode;
	public void add(String data) {
		Node newNode = new Node(data);
		
		if (headNode == null) {
			headNode=newNode;
		}else {
			Node currentNode=headNode;
			while(currentNode.nextNode!=null) {
				currentNode=currentNode.nextNode;
			}
			currentNode.nextNode=newNode;
		}
		sizeIncreaze();
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.nextNode=headNode;
		headNode=newNode;
		sizeIncreaze();
	}
	
	public void addLast(String data) {
		Node newNode =new Node(data);
		Node firstNode=headNode;
		while(firstNode.nextNode!=null) {
			firstNode=firstNode.nextNode;
		}
		firstNode.nextNode=newNode;
		sizeIncreaze();
	}
	
	public void sizeIncreaze() {
		++size;
		
	}
	
	public void printData() {
		Node currentNode=headNode;
		while(currentNode!=null) {
			System.out.println(currentNode.dataString);
			currentNode=currentNode.nextNode;
		}
		System.out.println(size);
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sLinkedList=new SinglyLinkedList();
		sLinkedList.add("Mazed");
		sLinkedList.add("sazed");
		sLinkedList.add("Hilaly Vai");
		sLinkedList.add("Aiyub vai");
		sLinkedList.addFirst("Rimon Mostafiz");
		sLinkedList.addLast("Rimon Mostafiz");
		sLinkedList.printData();
	}
}
