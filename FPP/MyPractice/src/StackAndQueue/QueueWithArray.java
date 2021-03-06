package StackAndQueue;

import java.util.Arrays;

public class QueueWithArray {
	String[] strArr;
	int size;
	int front;
	int rare;

	public static void main(String[] args) {

		QueueWithArray queueWithArray = new QueueWithArray();
		queueWithArray.enQueue("Mazed");
		queueWithArray.enQueue("Sazed");
		queueWithArray.enQueue("Rimon Mostafiz");
		queueWithArray.enQueue("Hellaly vai");
		queueWithArray.enQueue("Rasel Vai");

		// queueWithArray.enQueue("Fahad Vai");
//		queueWithArray.peek();
//		queueWithArray.peek();

		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.enQueue("Fahad Ahmed");
		queueWithArray.enQueue("Hiron Ahmed");
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.enQueue("Hiron Ahmed");
		queueWithArray.enQueue("Fahad Ahmed");
		queueWithArray.deQueue();
		queueWithArray.enQueue("Rasel Vai");
		queueWithArray.enQueue("Mazed");
		queueWithArray.enQueue("Sazed");
		queueWithArray.enQueue("Rimon Mostafiz");
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.deQueue();
		queueWithArray.enQueue("Mazed");
		queueWithArray.deQueue();
		queueWithArray.enQueue("Sazed");
		System.out.println(Arrays.toString(queueWithArray.strArr));

	}

	QueueWithArray() {
		strArr = new String[5];
		front = 0;
		size = 0;
		rare = -1;
	}

	public void enQueue(String data) {
		++rare;
		if (rare == strArr.length && front > 0) {
			rare = 0;
		}
		if (size == strArr.length) {
			System.out.println("Queue is full");
			return;
		}

		strArr[rare] = data;
		++size;
	}

	public void deQueue() {
		// String peekValString=peek();
		if (front == strArr.length && rare >= 0) {
			front = 0;
		}
		if (size == 0) {
			defaultSetUp();
			System.out.println("Queue is empty");
			return;
		}

		System.out.println(strArr[front] + " is removed");
		strArr[front] = null;
		++front;
		--size;

	}

	public String peek() {
		System.out.println(strArr[front] + " is peeked up");
		return strArr[front];
	}
	
	public void defaultSetUp() {
		front = 0;
		size = 0;
		rare = -1;
	}

	public String toString() {
		for (String arrVal : strArr) {
			if (arrVal != null) {
				return arrVal;
			}
		}
		return null;

	}
}
