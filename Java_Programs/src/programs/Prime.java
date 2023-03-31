package programs;

import java.util.Scanner;

public class Prime {

	static boolean isPrime(int no) {
		if (no <= 1) {
			return false;
		}
		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check prime : ");
		num = scanner.nextInt();

		if (isPrime(num)) {
			System.out.println("Number is prime.");
		} else {
			System.out.println("Number is not prime.");
		}

	}

}
