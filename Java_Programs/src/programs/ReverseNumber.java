package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, rev = 0, rem;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		num = scanner.nextInt();

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse number is : " + rev);
	}

}
