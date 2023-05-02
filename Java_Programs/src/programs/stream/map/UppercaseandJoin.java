/*
 * 	Convert string to uppercase and then join with comma
 */

package programs.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseandJoin {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		myList.add("Masum");
		myList.add("Aarju");
		myList.add("Devanshi");
		myList.add("Vishwa");
		myList.add("XXX");

		System.out.println(myList);

		String result = myList.stream().map(i -> i.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(result);

	}

}
