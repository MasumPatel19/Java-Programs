package programs;

import java.util.Scanner;

public class BinarySearchExample {

	public static Integer binary(int arr[], int search, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == search) {
				return mid;
			}
			if (arr[mid] < search) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

//		int arr[] = { 10, 20, 30, 40, 50 };

		int search, arrSize;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter array size : ");
		arrSize = scanner.nextInt();
		int arr[] = new int[arrSize];
		System.out.println("Enter " + arrSize + " Numbers : ");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter a number which you want to search : ");
		search = scanner.nextInt();

		int found = binary(arr, search, 0, arr.length - 1);

		if (found == -1) {
			System.out.println("Number is not found.");
		} else {
			System.out.println("Number is at : " + found + " index.");
		}

	}

}
