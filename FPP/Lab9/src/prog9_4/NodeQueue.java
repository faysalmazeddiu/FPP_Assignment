package prog9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		//implement
		Node newNode=new Node();
		newNode.data=s;
		if(this.tail ==null) {
			this.head=newNode;
			this.tail=newNode;
		}
		tail.next = newNode;
        tail = newNode;
	}	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		
		if(this.head != null) {
			String peekedString=peek();
			head=head.next;
			return peekedString;
		}
		return null;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		if(this.head !=null) {
			String retDataString=head.data;
			return retDataString;
		}
		return null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


