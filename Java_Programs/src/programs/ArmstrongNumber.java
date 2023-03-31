package programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, temp, rem, c = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number : ");
		num = scanner.nextInt();

		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			c = c + (rem * rem * rem);
			temp /= 10;
		}
		if (num == c) {
			System.out.println("Number is Armstrong.");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}
}
