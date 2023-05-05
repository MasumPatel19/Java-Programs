/*
 *  Check whether a particular key/value exist in a HashMap
 */

package programs.collection.map;

import java.util.HashMap;
import java.util.Map;

public class CheckKeyValueExist {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(101, "Employee1");
		myMap.put(102, "Employee2");
		myMap.put(103, "Employee3");
		myMap.put(104, "Employee4");

		myMap.entrySet().stream().forEach(System.out::println);

		System.out.println(myMap.containsKey(102));
		System.out.println(myMap.containsValue("Employee7"));

	}

}
