package LinkedList;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	public int countSize() {
		int size = 0;
		Node presentNode = header.next;
		while (presentNode != null) {
			++size;
			presentNode = presentNode.next;
		}
		return size;
	}

	void insert(String data, int pos) {
		int countPosition = 0;
		if (header == null || pos == 1) {
			addFirst(data);
		} else if (pos > countSize()) {
			addLast(data);
		} else {

			Node presentNode = header.next;
			while (presentNode != null) {

				++countPosition;
				if (pos == countPosition) {
					Node tempNode = presentNode;
					Node n = new Node(data);
					n.previous = presentNode.previous;
					// n.next=presentNode.previous.next;
					n.next = presentNode;
					presentNode.previous.next = n;
					presentNode.previous = n;

				}

				presentNode = presentNode.next;
			}

		}

	}

	boolean remove1(String data) {

		if (data == null || header.next == null) {
			return false;
		}
		Node presentNode = header.next;
		while (presentNode.next != null) {
			if (presentNode.value.equals(data)) {
				presentNode.previous.next = presentNode.next;
				presentNode.next.previous = presentNode.previous;
				return true;
			}
			presentNode = presentNode.next;
		}
		if (presentNode.value.equals(data) && presentNode.next == null) {
			presentNode.previous.next = null;
			return true;
		}
		return false;
	}
	/*
	public void minSort() {
		
		if (header == null)
			return;
		Node presentNode = header.next;
		//System.out.println("==="+presentNode.next);
		while (presentNode != null) {
			Node minNode = findMinNode(presentNode);
			swapNode(presentNode, minNode);
			presentNode = presentNode.next;
		}

	}
	*/
	public void minSort() {
		if (header.next != null) {
			Node presentNode = header.next;
			while (presentNode.next != null) {
				Node minNode = findMinNode(presentNode);
				swapNode(presentNode, minNode);
				presentNode = presentNode.next;
			}
		} else {
			return;
		}
	}

	private void swapNode(Node node, Node minNode) {
		String tempNodeVal = node.value;
		node.value = minNode.value;
		minNode.value = tempNodeVal;

	}

	private Node findMinNode(Node node) {
		//Node presentNode = header.next;
		Node minNode = node;
		while (node != null) {
			if (node.value.compareTo(minNode.value) < 0) {
				minNode = node;
			}
			node = node.next;
		}
		return minNode;
	}

	// implement

	boolean remove(String data) {
		if (data == null || header.next == null) {
			return false;
		}

		Node presentNode = header.next;
		while (presentNode.next != null) {
			if (presentNode.value.equals(data)) {
				Node nextNode = presentNode.next;
				Node previousNode = presentNode.previous;
				previousNode.next = nextNode;
				nextNode.previous = previousNode;
				return true;
			}
			presentNode = presentNode.next;
		}

		if (presentNode != null && presentNode.value.equals(data)) {
			Node previousNode = presentNode.previous;
			previousNode.next = null;
			return true;
		}

		return false;

	}

	
	/*
	public Node findMinNode(Node presentNode) {
		Node minNode = presentNode;
		while (presentNode != null) {
			if (presentNode.value.compareTo(minNode.value) < 0) {
				minNode = presentNode;
			}
			presentNode = presentNode.next;
		}
		return minNode;
	}

	public void swapNode(Node currentNode, Node minNode) {
		String temp = currentNode.value;
		currentNode.value = minNode.value;
		minNode.value = temp;
	}
   */
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;

		while (current.next != null) {
			current = current.next;
		}

		Node previous = current.previous;
		previous.next = null;
		current.previous = null;
	}

	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}

		if (next == null)
			return false;
		else {
			return true;
		}
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		list.addFirst("Hteve");

		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		list.addLast("Mazed");
		list.addLast("Abdul");
		System.out.println(list);
		list.minSort();
		System.out.println(list);
		/*
		 * System.out.println(list); list.remove("Harry"); System.out.println(list);
		 * list.remove("Steve"); System.out.println(list); list.remove("hteve");
		 * System.out.println(list); list.remove("Tom"); System.out.println(list);
		 * list.remove("Bob"); System.out.println(list); /* var list2 = new
		 * MyStringLinkedList(); String[] stringData = { "big", "small", "tall",
		 * "short", "round", "square", "enormous", "tiny", "gargantuan", "lilliputian",
		 * "numberless", "none", "vast", "miniscule" }; for (int i = 0; i <
		 * stringData.length; i++) { list2.addFirst(stringData[i]); }
		 * System.out.println(list2); list2.minSort(); System.out.println(list2);
		 */
	}

}
