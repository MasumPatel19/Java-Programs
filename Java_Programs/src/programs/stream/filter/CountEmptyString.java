/*
 *  Count Empty String in the list
 */
package programs.stream.filter;

import java.util.ArrayList;
import java.util.List;

public class CountEmptyString {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Masum");
		myList.add("");
		myList.add("Devanshi");
		myList.add("");
		myList.add("");

		long count = myList.stream().filter(i -> i.isEmpty()).count();

		System.out.println("In list " + count + " string is empty.");

	}

}
