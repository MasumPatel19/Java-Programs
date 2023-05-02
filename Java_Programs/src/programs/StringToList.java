package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringToList {

	public static void main(String[] args) {

		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = scanner.nextLine();

		String[] strArr = str.split(" ");

		List<String> myList = Arrays.asList(strArr);

		System.out.println(myList);
	}
}
