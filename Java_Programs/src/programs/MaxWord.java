package programs;

import java.util.Scanner;

public class MaxWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Enter a string : ");
		str = scanner.nextLine();

//		System.out.println(str);
		String[] words = str.split(" ");
		String maxWord = "";

		for (String s : words) {
			if (s.length() > maxWord.length()) {
				maxWord = s;
			}
		}

		System.out.println("The Longest word in the given string is : " + maxWord + "\nLength of Longest word is : "
				+ maxWord.length());

	}
}
