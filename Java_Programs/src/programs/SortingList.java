package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(11);
		myList.add(290);
		myList.add(4);
		myList.add(46);

		System.out.println(myList);

		Collections.sort(myList);
		System.out.println(myList);

	}

}
