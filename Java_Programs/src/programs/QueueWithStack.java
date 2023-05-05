package programs;

import java.util.Stack;

public class QueueWithStack {

	Stack<Integer> myStack1 = new Stack<>();
	Stack<Integer> myStack2 = new Stack<>();

	public void enqueue(int element) {
		myStack1.push(element);
		System.out.println(element + " inserted");
	}

	public void dequeue() {
		if (myStack2.isEmpty()) {
			while (!myStack1.isEmpty()) {
				myStack2.push(myStack1.pop());
			}
		}
		System.out.println(myStack2.pop() + " removed");
	}

	public static void main(String[] args) {

		QueueWithStack obj = new QueueWithStack();
		obj.enqueue(100);
		obj.enqueue(29);
		obj.enqueue(50);
		obj.dequeue();
		obj.enqueue(55);
		obj.dequeue();

	}

}
