package programs;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 100, 3, 56, 11, 9, 88, 50 };
		int key, j, i;
		System.out.println("Array : " + Arrays.toString(arr));

		for (i = 1; i < arr.length; ++i) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		for (i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");

	}
}
