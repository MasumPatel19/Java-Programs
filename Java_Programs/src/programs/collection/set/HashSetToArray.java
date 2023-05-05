package programs.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<>();
		mySet.add("Masum");
		mySet.add("Dhruvi");
		mySet.add("Vaibhav");
		mySet.add("Pratyush");

		System.out.println(mySet);

		// Convert set to array
		String[] array = new String[mySet.size()];
		mySet.toArray(array);

		System.out.println("\nArray values : ");
		for (String s : array) {
			System.out.println(s);
		}

	}

}
