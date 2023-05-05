/*
 * Replace a value associated with the given key if and only if it is currently mapped to given value
 */

package programs.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ReplaceCurrentValue {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Masum");
		myMap.put(2, "Devanshi");
		myMap.put(3, "Vishwa");
		myMap.put(4, "Riddhi");

		myMap.replace(3, "Vishwa", "Aarju");

		// myMap.replace(14, "Disha");

		myMap.entrySet().stream().forEach(System.out::println);

	}

}
