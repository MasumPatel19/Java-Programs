package programs;

import java.util.Calendar;

public class DayOfWeek {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println("Day of the week is : " + calendar.get(Calendar.DAY_OF_WEEK));

	}
}
