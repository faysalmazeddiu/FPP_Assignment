package prog9_3;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void increaseArrSize() {
		int resizeLength=2 * arr.length;
		int newArr[] = new int[resizeLength];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		this.arr = newArr;
	}
	
	public void enqueue(int value) {
		if(rear==arr.length) {
			increaseArrSize();
		}
		if(front==-1) {
			front=front+1;
		}
		arr[size++]=value;
		++rear;
		
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("sorry !! no data in queue!");
		}else {
			int peekedValue=peek();
			arr[front++]=0;
			--size;
			return peekedValue;
		}
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("sorry !! no data in queue!");
		}else {
			return arr[front]; 
		}
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

