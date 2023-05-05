package programs;

import java.util.ArrayList;
import java.util.List;

public class LoopInList {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(101);
		myList.add(77);
		myList.add(39);
		myList.add(90);
		myList.add(4);

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

	}

}
