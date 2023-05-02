/*
 * Count String whose length is > 5
 */
package programs.stream.filter;

import java.util.ArrayList;
import java.util.List;

public class CountLen {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Masum");
		myList.add("");
		myList.add("Devanshi");
		myList.add("");
		myList.add("");

		long cnt = myList.stream().filter(i -> i.length() >= 5).count();

		System.out.println(cnt);
	}

}
