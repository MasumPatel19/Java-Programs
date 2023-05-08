package programs;

public class FindMissing {

	public static int findMissingElement(int[] arr) {

		// length of array including missing element
		int n = arr.length + 1;

		// sum of all elements including missing element
		int sum = n * (n + 1) / 2;
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		int missingElement = sum - arrSum;
		return missingElement;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 8, 3, 5, 6, 4, 2 };
		System.out.println(findMissingElement(arr));

	}

}
