package programs;

import java.util.Scanner;

public class TransposeExample {

	public static void main(String[] args) {

		int i, j, row, column;
		System.out.println("Enter total rows and columns : ");
		Scanner scanner = new Scanner(System.in);
		row = scanner.nextInt();
		column = scanner.nextInt();

		int array[][] = new int[row][column];
		System.out.println("Enter matrix : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				array[i][j] = scanner.nextInt();
				System.out.print(" ");
			}
		}

		System.out.println("Before Transpose Matrix is : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("After Transpose Matrix is : ");
		for (i = 0; i < column; i++) {
			for (j = 0; j < row; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println(" ");
		}
	}

}
