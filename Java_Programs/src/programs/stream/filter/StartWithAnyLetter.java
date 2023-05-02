/*
 * Create a List and store string which start with D
 */
package programs.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithAnyLetter {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Masum");
		myList.add("Disha");
		myList.add("Devanshi");
		myList.add("Dev");
		myList.add("Aarju");

		List<String> result = myList.stream().filter(i -> i.startsWith("D")).collect(Collectors.toList());
		System.out.println(result);

	}

}
