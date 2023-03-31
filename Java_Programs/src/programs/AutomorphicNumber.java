package programs;

import java.util.Scanner;

public class AutomorphicNumber {

	static boolean isAutomorphic(int num) {

		int sqr = num * num;
		while (num > 0) {
			if (num % 10 != sqr % 10) {
				return false;
			}
			num /= 10;
			sqr /= 10;
		}
		return true;
	}

	public static void main(String[] args) {

		int num;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number : ");
		num = scanner.nextInt();

		if (isAutomorphic(num)) {
			System.out.println(num + "is Automorphic Number");
		} else {
			System.out.println(num + "is not Automorphic Number");
		}

	}

}
