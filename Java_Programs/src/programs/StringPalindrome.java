/*
 * Check the given string is palindrom or not
 */

package programs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		String str, rev = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = scanner.nextLine().toLowerCase();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
