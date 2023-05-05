package programs;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> myLinkList = new LinkedList<>();
		myLinkList.add(11);
		myLinkList.add(54);
		myLinkList.add(2);
		myLinkList.add(2, 34);

		System.out.println(myLinkList);

	}

}
