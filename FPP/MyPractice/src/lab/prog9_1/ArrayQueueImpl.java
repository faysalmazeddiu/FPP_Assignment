package lab.prog9_1;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;

	public int size() {
        return size;
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[front];
		}else {
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		}

	}

	public void enqueue(int n) {
		if(rear == arr.length) resize();
		if (front == -1) front = 0;
		arr[size] = n;
		size++;
		rear++;
	}

	public int dequeue() {
		if (!isEmpty()) {
			int n = peek();
			arr[front] = 0; // 0's mean particular field's not value
			front++;
			size--;
			return n;
		}else {
			throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		}
		
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	private void resize() {
		System.out.println("resizing...");
		int len = arr.length;
		int newlen = 2 * len;
		int[] temp = new int[newlen];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		// uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q);
	}
}
