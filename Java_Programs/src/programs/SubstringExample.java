package programs;

import java.util.Scanner;

public class SubstringExample {

	public static String substring(String str, int start, int end) {
		char[] chArray = str.toCharArray();
		char[] subCharArray = new char[end - start];

		for (int i = start; i < end; i++) {
			subCharArray[i - start] = chArray[i];
		}
		return new String(subCharArray);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = scanner.nextLine();

		int start, end;
		System.out.println("Enter starting index for substring : ");
		start = scanner.nextInt();
		System.out.println("Enter ending index < " + str.length() + " for substring : ");
		end = scanner.nextInt();

		System.out.println(substring(str, start, end));

	}
}
