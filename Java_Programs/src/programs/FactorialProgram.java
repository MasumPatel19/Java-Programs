/*
 * Display Factorial of a number
 */

package programs;

import java.util.Scanner;

public class FactorialProgram {

	static int factorial(int n) {
		if (n >= 1) {
			return (n * factorial(n - 1));
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for factorial : ");
		num = scanner.nextInt();

		System.out.println("Factorial of " + num + " is = " + factorial(num));

	}

}
