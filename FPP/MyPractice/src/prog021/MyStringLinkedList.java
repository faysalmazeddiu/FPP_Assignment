package prog021;

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

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	// implement
	int size() {
		if (header.next == null)
			return 0;
		Node current = header.next;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	// implement
	void insert(String data, int pos) {
		if (pos < 0 || pos > size()) {
			throw new IllegalArgumentException("Illegal position for insert Node!");
		}
		if (pos == 0)
			addFirst(data);
		else if (pos == size())
			addLast(data);
		else {
			Node newNode = new Node(data);
			if (header.next == null)
				header.next = newNode;
			else {
				Node temp = header.next;
				int count = 1;
				while (count < pos) {
					temp = temp.next;
					count++;
				}
				// insert n between temp and temp.node
				Node last = temp.next;
				newNode.next = last;
				last.previous = newNode;
				newNode.previous = temp;
				temp.next = newNode;

			}
		}
	}

	// implement
	boolean remove(String s) {
		if (s == null || header.next == null)
			return false;
		Node current = header.next;
		while (current.next != null) {
			if (current.value.equals(s)) {
				Node next = current.next;
				Node previous = current.previous;
				previous.next = next;
				next.previous = previous;
				return true;
			}
			current = current.next;
		}

		if (current != null && current.value.equals(s)) {
			Node previous = current.previous;
			previous.next = null;
			return true;
		}

		return false;

	}

	public void sort() {

		if (header == null)
			return;
		Node current = header.next;
		while (current != null) {
			Node min = minNode(current);
			swap(current, min);
			current = current.next;
		}

	}

	public void swap(Node current, Node min) {
		String temp = current.value;
		current.value = min.value;
		min.value = temp;
	}

	public Node minNode(Node current) {
		Node min = current;
		while (current != null) {
			if (current.value.compareTo(min.value) < 0) {
				min = current;
			}
			current = current.next;
		}
		return min;
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
	
	public void populateNodes() {
		String[] stringData = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		for (int i = 1; i < stringData.length; i++) {
			addFirst(stringData[i]);
		}
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
		MyStringLinkedList list = new MyStringLinkedList();
		list.populateNodes();
		list.sort();
		System.out.println(list);

	}
}
