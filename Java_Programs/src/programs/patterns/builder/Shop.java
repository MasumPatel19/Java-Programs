package programs.patterns.builder;

public class Shop {

	public static void main(String[] args) {
		Phone p = new BuilderClass().setOs("Android").setScreenSize(5.4).getPhone();
		System.out.println(p);
	}

}
