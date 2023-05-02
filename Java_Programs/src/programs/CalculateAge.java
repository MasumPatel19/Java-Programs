/*
 *  Calculate age and display in years,months and days formate
 */

package programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {

		String birthDate;
		int year, month, days;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your Birthdate in YYYY-MM-DD formate : ");
			birthDate = scanner.nextLine();
			LocalDate dob = LocalDate.parse(birthDate);
			LocalDate currentDate = LocalDate.now();

			year = Period.between(dob, currentDate).getYears();
			month = Period.between(dob, currentDate).getMonths();
			days = Period.between(dob, currentDate).getDays();

			System.out.println(year + " Year , " + month + " Month , " + days + " Days");

		} catch (Exception e) {
			System.out.println("Oops...Please Enter valid date with valid formate.");
		}

	}

}
