package programs;

import java.util.Scanner;

public class CheckStringEmptyOrNull {

	public static String checkString(String str) {
		if (str == null) {
			return "Null";
		} else if (str.trim().isEmpty()) {
			return "Empty";
		} else {
			return "Neither null nor empty";
		}
	}

	public static void main(String[] args) {

		String str1 = null;
		String str2 = "";
		String str3 = "  ";

		System.out.println(checkString(str1));
		System.out.println(checkString(str2));
		System.out.println(checkString(str3));

	}

}
