package programs;

import java.time.LocalDate;
import java.util.Calendar;

public class AddTwoDates {

	public static void main(String[] args) {

		String date1 = "2022-04-01";
		String date2 = "2023-05-01";

		LocalDate ld1 = LocalDate.parse(date1);
		LocalDate ld2 = LocalDate.parse(date2);

		LocalDate combineDates = ld1.plusDays(ld2.getDayOfMonth()).plusMonths(ld2.getMonthValue())
				.plusYears(ld2.getYear());

		System.out.println("Adding of dates : " + combineDates);

		/*
		 * Calendar c1 = Calendar.getInstance(); Calendar c2 = Calendar.getInstance();
		 * Calendar cTotal = (Calendar) c1.clone();
		 * 
		 * cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
		 * cTotal.add(Calendar.MONTH,c2.get(Calendar.MONTH) + 1); // Zero-based months
		 * cTotal.add(Calendar.DATE,c2.get(Calendar.DATE));
		 * cTotal.add(Calendar.HOUR_OF_DAY,c2.get(Calendar.HOUR_OF_DAY));
		 * cTotal.add(Calendar.MINUTE,c2.get(Calendar.MINUTE));
		 * cTotal.add(Calendar.SECOND,c2.get(Calendar.SECOND));
		 * cTotal.add(Calendar.MILLISECOND,c2.get(Calendar.MILLISECOND));
		 * 
		 * System.out.format("%s + %s = %s", c1.getTime(),c2.getTime(),cTotal.getTime());
		 */

	}

}
