package programs;

import java.util.Scanner;

public class CountCharacterInString {

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total character in string is : " + count);
	}

}
