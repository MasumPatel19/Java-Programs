package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First String : ");
		String str1 = scanner.nextLine().toLowerCase();

		System.out.println("Enter Second String : ");
		String str2 = scanner.nextLine().toLowerCase();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not Anagram");
		}

	}

}
