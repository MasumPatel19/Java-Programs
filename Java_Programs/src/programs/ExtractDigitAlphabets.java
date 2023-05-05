/*
 * Write a program to extract digits and alphabets from the given string and sort them in ascending order.
 */

package programs;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractDigitAlphabets {

	public static void main(String[] args) {
		String string;
		int i;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String with Numbers : ");

		string = scanner.nextLine();
		char[] letterArray = new char[string.length()];
		char[] numberArray = new char[string.length()];

		char[] ch = string.toCharArray();
		for (i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letterArray[i] = ch[i];
//				System.out.prinit(letterArray[i] + " ");
			} else if (Character.isDigit(ch[i])) {
				numberArray[i] = ch[i];
//				 System.out.print(numberArray[i]+" ");
			}
		}

		System.out.println("\nShorting Letter : ");
		Arrays.sort(letterArray);
		System.out.println(letterArray);
		System.out.println("Shorting Number : ");
		Arrays.sort(numberArray);
		System.out.println(numberArray);
	}

}
