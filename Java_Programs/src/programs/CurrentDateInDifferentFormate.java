package programs;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CurrentDateInDifferentFormate {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);

		LocalDate currentDate = LocalDate.now();
		System.out.println("Today's Date is : " + currentDate);
		System.out.println(
				"Formates for Date : \n 1.yyyy-MM-dd\n 2.MM/dd/yyyy\n 3.dd/MM/yyyy\n 4.dd-MMM-yyyy\n\n Enter choice : ");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println(currentDate);
			break;

		case 2:
			Format f1 = new SimpleDateFormat("MM/dd/yyyy");
			String formate1 = f1.format(new Date());
			System.out.println(formate1);
			break;

		case 3:
			Format f2 = new SimpleDateFormat("dd/MM/yyyy");
			String formate2 = f2.format(new Date());
			System.out.println(formate2);
			break;

		case 4:
			Format f3 = new SimpleDateFormat("dd-MMM-yyyy");
			String formate3 = f3.format(new Date());
			System.out.println(formate3);
			break;

		default:
			break;
		}
	}

}
