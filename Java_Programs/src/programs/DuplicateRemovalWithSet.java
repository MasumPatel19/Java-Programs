package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemovalWithSet {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("b");

		Set<String> mySet = new LinkedHashSet<>(myList);

		List<String> myUpdatedList = new ArrayList<>(mySet);

		System.out.println("Original List : " + myList);
		System.out.println("List after removing duplicates : " + myUpdatedList);

		System.out.println();

		Integer[] arr = { 1, 22, 3, 4, 22, 5, 1 };

		Set<Integer> setData = new HashSet<>(Arrays.asList(arr));

		System.out.println("Array numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNumbers after removing duplicates : " + setData);

	}
}
