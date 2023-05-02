package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scanner.nextLine();

		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (end > start) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		String reversString = new String(arr);
		System.out.println("Reversed String is : " + reversString);

	}

}
