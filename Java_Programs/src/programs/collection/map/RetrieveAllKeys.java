/*
 * Retrieve all keys present in a HashMap
 */

package programs.collection.map;

import java.util.HashMap;
import java.util.Map;

public class RetrieveAllKeys {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Student1");
		myMap.put(2, "Student2");
		myMap.put(13, "Student3");
		myMap.put(4, "Student4");

		System.out.println("Keys in a Map : ");
		myMap.keySet().stream().forEach(System.out::println);

		System.out.println("\nValues in a Map : ");
		myMap.values().stream().forEach(System.out::println);

	}

}
