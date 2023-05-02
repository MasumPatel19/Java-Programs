/*
 * create a list and store string which is not empty and blank
 */

package programs.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotEmptyString {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Masum");
		myList.add("");
		myList.add("Devanshi");
		myList.add("Vishwa");
		myList.add(" ");

		List<String> result = myList.stream().filter(i -> !i.isEmpty() && !i.isBlank()).collect(Collectors.toList());
		System.out.println(result);

	}

}
