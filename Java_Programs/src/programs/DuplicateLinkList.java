package programs;

import java.util.LinkedList;
import java.util.List;

public class DuplicateLinkList {

	public static void main(String[] args) {

		List<Integer> myList = new LinkedList<>();
		myList.add(11);
		myList.add(22);
		myList.add(33);
		myList.add(99);
		myList.add(22);

		System.out.println("Original List : "+myList);

		List<Integer> myCopyList = new LinkedList<>(myList);
		System.out.println("\nDuplicate List : "+myCopyList);

	}

}
