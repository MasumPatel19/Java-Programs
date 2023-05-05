package programs;

public class StringImmutability {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
