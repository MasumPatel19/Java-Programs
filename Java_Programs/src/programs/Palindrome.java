package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rem, sum = 0, temp, num;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check palindrome : ");
		num = scanner.nextInt();

		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
