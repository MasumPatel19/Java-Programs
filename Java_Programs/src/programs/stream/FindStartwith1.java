/*
 * Find out all the numbers starting with 1.
 */
package programs.stream;

import java.util.ArrayList;
import java.util.List;

public class FindStartwith1 {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(30);
		myList.add(10);
		myList.add(18);
		myList.add(88);

		System.out.println(myList);
		System.out.println("\nNumbers start with 1 : ");
		myList.stream().map(i -> i + "").filter(i -> i.startsWith("1")).forEach(System.out::println);

	}

}
