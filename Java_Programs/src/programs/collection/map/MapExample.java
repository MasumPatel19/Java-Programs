/*
 * Add given key-value pair to HashMap if and only if it is not present in the HashMap
 */

package programs.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Masum");
		myMap.put(2, "Devanshi");
		myMap.put(3, "Vishwa");

		myMap.entrySet().stream().forEach(System.out::println);

		System.out.println();

		myMap.putIfAbsent(2, "Aarju");
		myMap.putIfAbsent(5, "Disha");

		myMap.entrySet().stream().forEach(System.out::println);

	}

}
