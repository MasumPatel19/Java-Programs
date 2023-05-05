package programs;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleValue {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(101);
		myList.add(102);
		myList.add(103);
		myList.add(183);
		myList.add(104);
		myList.add(105);
		myList.add(500);

		System.out.println(myList);

		int middle = myList.size() / 2;
		System.out.println("Middle element in list is : " + myList.get(middle));

	}

}
