/*
 *  Sort all the values in descending order
 */

package programs.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInDescendingOrder {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(15);
		myList.add(2);
		myList.add(20);
		myList.add(7);
		myList.add(85);

		System.out.println(myList);

		System.out.println("\nList in Descending Order : ");
		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
