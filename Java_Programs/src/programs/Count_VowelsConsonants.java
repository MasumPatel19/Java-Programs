package programs;

import java.util.Scanner;

public class Count_VowelsConsonants {

	public static void main(String[] args) {

		System.out.println("Enter String : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toLowerCase();

		int i, vcount = 0, ccount = 0;

		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vcount++;
			} else {
				ccount++;
			}
		}

		System.out.println("Vowels : " + vcount + "\nConsonants : " + ccount);

	}

}
