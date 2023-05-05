/*
 * Find out the number of key-value mappings present in a HashMap
 */

package programs.collection.map;

import java.util.HashMap;
import java.util.Map;

public class CountKeyValuePresent {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Student1");
		myMap.put(2, "Student2");
		myMap.put(3, "Student3");
		myMap.put(4, "Student4");

		myMap.entrySet().stream().forEach(System.out::println);

		System.out.println();
		System.out.println(myMap.size() + " Key Value Present in a map");

	}

}
