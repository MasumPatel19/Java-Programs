package programs;

public class MaxMinExample {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 120, 33, 405, 5, 60, 870, 46 };
		int i, max = arr[0], min = arr[0];

		System.out.println("Numbers is : ");
		// display the array
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// if the value is greater than the max value than we can add value in max and
		// also we can check if the value is smaller than min value than we can add
		// value in min
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("\nMaximum Number is : " + max + "\nMinimum Number is : " + min);
	}

}
