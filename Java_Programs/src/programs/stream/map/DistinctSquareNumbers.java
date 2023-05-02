/*
 * Create a List of the square of all distinct numbers
 */
package programs.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSquareNumbers {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(2);
		myList.add(5);
		myList.add(2);

		System.out.println(myList);

		List<Integer> result = myList.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(result);

	}
}
